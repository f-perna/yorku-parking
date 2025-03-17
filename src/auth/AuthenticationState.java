package auth;

import java.util.ArrayList;
import java.util.List;
import client.Client;

public class AuthenticationState {
    private static AuthenticationState instance;
    private List<AuthStateObserver> observers;
    private Client loggedInClient;

    private AuthenticationState() {
        observers = new ArrayList<>();
    }

    public static AuthenticationState getInstance() {
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

    public void setLoggedInClient(Client client) {
        this.loggedInClient = client;
        notifyObservers();
    }

    public Client getLoggedInClient() {
        return loggedInClient;
    }

    public boolean isLoggedIn() {
        return loggedInClient != null;
    }

    private void notifyObservers() {
        for (AuthStateObserver observer : observers) {
            observer.onAuthStateChanged(isLoggedIn());
        }
    }
}