package models.auth;

import java.util.ArrayList;
import java.util.List;

import models.client.Client;
import models.manager.Manager;

public class AuthenticationState {
    private static AuthenticationState instance;
    private List<AuthStateObserver> observers;
    private Client loggedInClient;
    private Manager loggedInManager;

    private AuthenticationState() {
        observers = new ArrayList<>();
    }

    public static synchronized AuthenticationState getInstance() {
        if (instance == null) {
            instance = new AuthenticationState();
        }
        return instance;
    }

    public void addObserver(AuthStateObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AuthStateObserver observer) {
        observers.remove(observer);
    }

    public Client getLoggedInClient() {
        return loggedInClient;
    }

    public Manager getLoggedInManager() {
        return loggedInManager;
    }

    public void setLoggedInClient(Client client) {
        this.loggedInClient = client;
        this.loggedInManager = null; // Clear manager when client logs in
        notifyObservers();
    }

    public void setLoggedInManager(Manager manager) {
        this.loggedInManager = manager;
        this.loggedInClient = null; // Clear client when manager logs in
        notifyObservers();
    }

    public boolean isLoggedIn() {
        return loggedInClient != null || loggedInManager != null;
    }

    public boolean isClientLoggedIn() {
        return loggedInClient != null;
    }

    public boolean isManagerLoggedIn() {
        return loggedInManager != null;
    }

    public boolean isSuperManagerLoggedIn() {
        return loggedInManager != null && loggedInManager.isSuperManager();
    }

    private void notifyObservers() {
        for (AuthStateObserver observer : observers) {
            observer.onAuthStateChanged(isLoggedIn());
        }
    }
}