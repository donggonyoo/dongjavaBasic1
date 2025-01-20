package javaBasic1.exception.basic.checked;

public class MyCheckedException extends Exception{
	public MyCheckedException(String message) {
		super(message);
	}
	//예외 클래스를 만들려면 예외를 상속 받으면 된다.
	//`Exception` 을 상속받은 예외는 체크 예외가 된다.

}
