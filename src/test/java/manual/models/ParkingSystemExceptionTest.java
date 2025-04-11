package manual.models;

import org.junit.jupiter.api.Test;

import models.ParkingSystemException;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSystemExceptionTest {

    @Test
    public void testConstructorWithMessage() {
        String message = "Test message";
        ParkingSystemException exception = new ParkingSystemException(message);
        assertEquals(message, exception.getMessage());
        assertEquals(ParkingSystemException.ErrorType.SYSTEM_ERROR, exception.getErrorType());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndErrorType() {
        String message = "Validation failed";
        ParkingSystemException.ErrorType errorType = ParkingSystemException.ErrorType.VALIDATION;
        ParkingSystemException exception = new ParkingSystemException(message, errorType);
        assertEquals(message, exception.getMessage());
        assertEquals(errorType, exception.getErrorType());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        String message = "Database error";
        Throwable cause = new RuntimeException("CSV exception");
        ParkingSystemException exception = new ParkingSystemException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(ParkingSystemException.ErrorType.SYSTEM_ERROR, exception.getErrorType());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testConstructorWithMessageErrorTypeAndCause() {
        String message = "User not authorized";
        ParkingSystemException.ErrorType errorType = ParkingSystemException.ErrorType.AUTHORIZATION;
        Throwable cause = new SecurityException("Access denied");
        ParkingSystemException exception = new ParkingSystemException(message, errorType, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(errorType, exception.getErrorType());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testExceptionThrowingAndCatching() {
        ParkingSystemException exception = assertThrows(
                ParkingSystemException.class,
                () -> {
                    throw new ParkingSystemException("Business rule/system requirement violation",
                            ParkingSystemException.ErrorType.BUSINESS_LOGIC);
                });
        assertEquals("Business rule/system requirement violation", exception.getMessage());
        assertEquals(ParkingSystemException.ErrorType.BUSINESS_LOGIC, exception.getErrorType());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithNullMessage() {
        ParkingSystemException exception = new ParkingSystemException(null, ParkingSystemException.ErrorType.NOT_FOUND);
        assertNull(exception.getMessage());
        assertEquals(ParkingSystemException.ErrorType.NOT_FOUND, exception.getErrorType());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithNullCause() {
        String message = "Resource conflict";
        ParkingSystemException.ErrorType errorType = ParkingSystemException.ErrorType.CONFLICT;
        ParkingSystemException exception = new ParkingSystemException(message, errorType, null);
        assertEquals(message, exception.getMessage());
        assertEquals(errorType, exception.getErrorType());
        assertNull(exception.getCause());
    }
}
