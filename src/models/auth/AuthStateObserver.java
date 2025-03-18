package models.auth;

public interface AuthStateObserver {
    void onAuthStateChanged(boolean isLoggedIn);
}