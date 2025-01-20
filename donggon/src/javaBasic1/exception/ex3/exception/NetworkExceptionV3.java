package javaBasic1.exception.ex3.exception;

public class NetworkExceptionV3 extends Exception{
	public NetworkExceptionV3(String message) {
		super(message);
//NetworkClient` 에서 발생하는 모든 예외는 이 예외를 부모로 하도록 설계한다.
	}

}
