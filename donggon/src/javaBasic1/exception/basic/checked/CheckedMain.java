package javaBasic1.exception.basic.checked;

public class CheckedMain {
	public static void main(String[] args) {
		Service service = new Service();
		System.out.println("예외를 잡아서 처리");
		service.callCatch();
		System.out.println("정상종료");
	}
}
