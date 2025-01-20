package javaBasic1.lang.clazz;

public class ClassCreateMain {

	public static void main(String[] args) throws Exception{
		Class helloClass = Class.forName("lang.clazz.Hello");
		Hello hello=(Hello)helloClass.getDeclaredConstructor().newInstance();
		String string = hello.Hello();
		System.out.println(string);
		
		
		

	}

}
