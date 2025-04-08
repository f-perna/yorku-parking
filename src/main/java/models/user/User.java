package models.user;

public interface User {
	String getEmail();

	String getPassword();

	boolean authenticate(String email, String password);
}
