package services;

import java.util.List;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.manager.SuperManager;
import repositories.ManagerRepository;

public class SuperManagerService {
    private ManagerRepository managerRepository;
    private AuthenticationState authState;

    public SuperManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
        this.authState = AuthenticationState.getInstance();
    }

    public boolean login(String username, String password) {
        // Get the singleton SuperManager instance
        SuperManager superManager = SuperManager.getInstance();

        // Check credentials
        if (superManager.authenticate(username, password)) {
            authState.setLoggedInUser(superManager);
            return true;
        }

        return false;
    }

    public boolean logout() {
        if (authState.isSuperManagerLoggedIn()) {
            authState.setLoggedInUser(null);
            return true;
        }
        return false;
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

        return managerRepository.addManager(manager);
    }

    public boolean removeManager(String email) {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can remove managers");
        }

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        return managerRepository.removeManager(email.toLowerCase().trim());
    }

    public List<Manager> getAllManagers() {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can view all managers");
        }

        return managerRepository.getAllManagers();
    }

    public Manager getManagerByEmail(String email) {
        if (!authState.isSuperManagerLoggedIn()) {
            throw new IllegalStateException("Only super managers can view manager details");
        }

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        return managerRepository.getManagerByEmail(email.toLowerCase().trim());
    }
}
