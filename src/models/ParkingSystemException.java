package models;

/**
 * Custom exception class for the parking system.
 * Used to standardize error handling across the application.
 */
public class ParkingSystemException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public enum ErrorType {
        AUTHENTICATION,
        AUTHORIZATION,
        VALIDATION,
        DATA_ACCESS,
        BUSINESS_LOGIC,
        SYSTEM_ERROR
    }

    private final ErrorType errorType;

    public ParkingSystemException(String message) {
        super(message);
        this.errorType = ErrorType.SYSTEM_ERROR;
    }

    public ParkingSystemException(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }

    public ParkingSystemException(String message, Throwable cause) {
        super(message, cause);
        this.errorType = ErrorType.SYSTEM_ERROR;
    }

    public ParkingSystemException(String message, ErrorType errorType, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}