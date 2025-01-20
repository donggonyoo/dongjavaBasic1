package javaBasic1.nested.finaltest;

public class AnonymousMain {

	public static void main(String[] args) {
		Hello a = new Hello() {

			@Override
			public void hello() {
				System.out.println("Hello.hello");

			}
		};a.hello();
		System.out.println(a.getClass());
		
		
	}
}

