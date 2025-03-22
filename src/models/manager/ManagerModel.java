package models.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ManagerModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Manager> managers;
    private static final String DATA_FILE = "data/managers.dat";

    public ManagerModel() {
        this.managers = new ArrayList<>();
        loadManagers();
    }

    public List<Manager> getAllManagers() {
        return new ArrayList<>(managers);
    }

    public Manager getManagerByEmail(String email) {
        if (email == null) {
            return null;
        }

        return managers.stream()
                .filter(manager -> email.equals(manager.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public boolean addManager(Manager manager) {
        if (manager == null || getManagerByEmail(manager.getEmail()) != null) {
            return false;
        }

        managers.add(manager);
        saveManagers();
        return true;
    }

    public boolean removeManager(String email) {
        Manager manager = getManagerByEmail(email);
        if (manager == null) {
            return false;
        }

        managers.remove(manager);
        saveManagers();
        return true;
    }

    public Manager authenticateManager(String email, String password) {
        Manager manager = getManagerByEmail(email);
        if (manager != null && manager.authenticate(email, password)) {
            return manager;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private void loadManagers() {
        File file = new File(DATA_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                managers = (List<Manager>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                managers = new ArrayList<>();
            }
        }

        // Add a default manager if none exists
        if (managers.isEmpty()) {
            managers.add(new Manager("admin@parking.com", "admin123"));
            saveManagers();
        }
    }

    public void saveManagers() {
        try {
            File file = new File(DATA_FILE);
            file.getParentFile().mkdirs();

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(managers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}