package javaBasic1.nested.finaltest;

public class AnonymousMain_ramda {
	
	public static void ramda(Hello hello) {
		hello.hello();
	}

	public static void main(String[] args) {
		ramda(()->{
			System.out.println("Hello.hello");
			
		});
	
	}
}

