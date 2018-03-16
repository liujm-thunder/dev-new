package exception;

public class DeveloperException extends Exception {
	private String errorCode;
	private Object[] stubParams;
	public DeveloperException(String message) {
		super(message);
	}

	public DeveloperException(String message, String errorCode, Object... stubParams) {
		super(message);
		this.errorCode = errorCode;
		this.stubParams = stubParams;
	}

	public DeveloperException(String message, Throwable ex, String errorCode,
                              Object... stubParams) {
		super(message, ex);
		this.errorCode = errorCode;
		this.stubParams = stubParams;
	}

	public DeveloperException(String message, Throwable ex, String errorCode) {
		super(message, ex);
		this.errorCode = errorCode;
	}

	public DeveloperException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public Object[] getStubParams() {
		return stubParams;
	}

}
