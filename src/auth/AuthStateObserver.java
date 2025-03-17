package auth;

public interface AuthStateObserver {
    void onAuthStateChanged(boolean isLoggedIn);
}