package javaBasic1.exception.ex4.exception;

public class NetworkExceptionV4 extends RuntimeException{
	public NetworkExceptionV4(String message) {
		super(message);
//NetworkClient` 에서 발생하는 모든 예외는 언체크 예외로 설정
	}

}
