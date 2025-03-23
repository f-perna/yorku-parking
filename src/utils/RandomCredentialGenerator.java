package utils;

import java.util.Random;

public class RandomCredentialGenerator {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final String DOMAIN = "parking.yorku.ca";
    private static final Random random = new Random();

    public static String generateRandomEmail() {
        // Generate username part (8-12 characters)
        int usernameLength = 8 + random.nextInt(5);
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < usernameLength; i++) {
            username.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }

        return username.toString().toLowerCase() + "@" + DOMAIN;
    }

    public static String generateRandomPassword() {
        // Generate password (10-14 characters)
        int passwordLength = 10 + random.nextInt(5);
        StringBuilder password = new StringBuilder();

        // Ensure at least one uppercase, one lowercase, one digit
        password.append(CHARS.charAt(random.nextInt(26))); // Uppercase
        password.append(CHARS.charAt(26 + random.nextInt(26))); // Lowercase
        password.append(CHARS.charAt(52 + random.nextInt(10))); // Digit

        // Fill the rest randomly
        for (int i = 3; i < passwordLength; i++) {
            password.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }

        // Shuffle the password characters
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