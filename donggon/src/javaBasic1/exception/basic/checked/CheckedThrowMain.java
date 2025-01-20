package javaBasic1.exception.basic.checked;

public class CheckedThrowMain {
	public static void main(String[] args) {
		Service service = new Service();
		System.out.println("예외를 처리 x");
//		service.callThrow();
		System.out.println("정상종료");
	}
}
