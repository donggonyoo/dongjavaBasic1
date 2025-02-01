package javaBasic1.nested.finaltest;

public class AnonymousMain {

	public static void main(String[] args) {
		Hello a = new Hello() {

			@Override
			public void print() {
				System.out.println("Hello.hello");

			}
		};
		a.print();
		System.out.println(a.getClass());
		
		
	}
}

