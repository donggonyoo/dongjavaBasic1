package javaBasic1.exception.basic.unchecked;

public class Service {
	Client client = new Client();
	
	public void callCatch() {
		try {
			client.call();
			
		} catch (MyUncheckedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("정상 로직");
	}
//	예외를 잡지 않아도된다
//	자연스럽게 상위로 넘어감.
//	체크예외와 다르게 throws선언 안해도 됨
	public void callThrow() {
		client.call();
	}
}
