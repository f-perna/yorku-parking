// For file SuperManager.java
package models.manager;

public class SuperManager extends Manager {

	public SuperManager(String username, String password) {
		super(username, password);
	}

	public Manager createManager(String username, String password) {
		return null;
	}
	
	public void removeManager(String username) {
		
	}

}
