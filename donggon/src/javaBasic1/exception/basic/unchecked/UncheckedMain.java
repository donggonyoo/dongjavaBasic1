package javaBasic1.exception.basic.unchecked;

public class UncheckedMain {
	public static void main(String[] args) {
		Service service = new Service();
		service.callCatch();
		System.out.println("정상종료");
	}
}
