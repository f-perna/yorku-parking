package utils;

import java.util.Random;

public class RandomCredentialGenerator {
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SYMBOLS = "@$!%*?&_#";
	private static final String DOMAIN = "parking.yorku.ca";
	private static final Random random = new Random();

	public static String generateRandomEmail() {
		int usernameLength = 8 + random.nextInt(5);
		StringBuilder username = new StringBuilder();
		for (int i = 0; i < usernameLength; i++) {
			username.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
		}

		return username.toString().toLowerCase() + "@" + DOMAIN;
	}

	public static String generateRandomPassword() {
		int passwordLength = 12 + random.nextInt(4); // Generate passwords between 12-15 characters
		StringBuilder password = new StringBuilder();

		// Ensure at least one character from each required group
		password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
		password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
		password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
		password.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));

		// Fill the rest with random characters from all groups
		String allChars = UPPERCASE + LOWERCASE + DIGITS + SYMBOLS;
		for (int i = 4; i < passwordLength; i++) {
			password.append(allChars.charAt(random.nextInt(allChars.length())));
		}

		// Shuffle the password to make it more random
		char[] passwordArray = password.toString().toCharArray();
		for (int i = 0; i < passwordArray.length; i++) {
			int j = random.nextInt(passwordArray.length);
			char temp = passwordArray[i];
			passwordArray[i] = passwordArray[j];
			passwordArray[j] = temp;
		}

		return new String(passwordArray);
	}
}