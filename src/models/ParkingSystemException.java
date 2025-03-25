package models;

public class ParkingSystemException extends RuntimeException {

	public enum ErrorType {
		VALIDATION, // Input validation errors
		AUTHENTICATION, // User authentication errors
		AUTHORIZATION, // User authorization errors
		BUSINESS_LOGIC, // Business rule violations
		DATA_ACCESS, // Database/file access errors
		NOT_FOUND, // Resource not found errors
		CONFLICT, // Resource conflict errors
		SYSTEM_ERROR // Unexpected system errors
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