package services;

import java.util.List;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.manager.ManagerModel;

public class ManagerService {
    private ManagerModel managerModel;
    private AuthenticationState authState;

    public ManagerService(ManagerModel managerModel) {
        this.managerModel = managerModel;
        this.authState = AuthenticationState.getInstance();
    }

    public boolean login(String email, String password) {
        if (email == null || password == null) {
            return false;
        }

        email = email.toLowerCase().trim();

        Manager manager = managerModel.authenticateManager(email, password);
        if (manager != null) {
            authState.setLoggedInUser(manager);
            return true;
        }
        return false;
    }

    public List<Manager> getAllManagers() {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can view all managers");
        }

        return managerModel.getAllManagers();
    }

    public Manager getManagerByEmail(String email) {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can view manager details");
        }

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        return managerModel.getManagerByEmail(email.toLowerCase().trim());
    }

    public boolean addManager(String email, String password) {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can add new managers");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }

        email = email.toLowerCase().trim();
        Manager manager = new Manager(email, password);

        return managerModel.addManager(manager);
    }

    public boolean removeManager(String email) {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can remove managers");
        }

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        return managerModel.removeManager(email.toLowerCase().trim());
    }

    public boolean logout() {
        if (authState.isManagerLoggedIn() || authState.isSuperManagerLoggedIn()) {
            authState.setLoggedInUser(null);
            return true;
        }
        return false;
    }
}