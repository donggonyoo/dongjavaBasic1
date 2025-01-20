package javaBasic1.exception.ex;

public class NetworkExceptionV1 extends Exception{
	
	private String errorCode;
	
	public NetworkExceptionV1(String errorCode ,  String message) {
		super(message);
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}

}
