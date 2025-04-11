package manual.utils;

import org.junit.jupiter.api.Test;

import utils.RandomCredentialGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class RandomCredentialGeneratorTest {

    @Test
    public void testGenerateRandomEmail() {
        
        for (int i = 0; i < 10; i++) {
            String email = RandomCredentialGenerator.generateRandomEmail();
            
            
            assertTrue(email.endsWith("@parking.yorku.ca"), "Email must end with @parking.yorku.ca");

            
            String username = email.split("@")[0];
            
           
            assertTrue(username.length() >= 8 && username.length() <= 12, 
                "Username length must be between 8 and 12 characters");

            
            assertTrue(username.chars().allMatch(Character::isLowerCase), 
                "Username must contain only lowercase characters");
            assertTrue(username.chars().allMatch(Character::isLetter), 
                "Username must contain only letters");
        }
    }

    @Test
    public void testGenerateRandomPassword() {
        
        for (int i = 0; i < 10; i++) {
            String password = RandomCredentialGenerator.generateRandomPassword();
            
            
            assertTrue(password.length() >= 12 && password.length() <= 15, 
                "Password length must be between 12 and 15 characters");

            
            assertTrue(password.chars().anyMatch(Character::isUpperCase), 
                "Password must contain at least one uppercase letter");

            
            assertTrue(password.chars().anyMatch(Character::isLowerCase), 
                "Password must contain at least one lowercase letter");

            
            assertTrue(password.chars().anyMatch(Character::isDigit), 
                "Password must contain at least one digit");

           
            assertTrue(password.chars().anyMatch(c -> "@$!%*?&_#".indexOf(c) != -1), 
                "Password must contain at least one symbol from @$!%*?&_#");
        }
    }
}