package javaBasic1.lang.object.equals;

public class Eqaulss {
	public static void main(String[] args) {
		
		Hello hello1 = new Hello("Hi");
		Hello hello2 = new Hello("Hi"); //둘은 참조값이 다름 
		
		System.out.println("동일성 비교 '=='");
		System.out.println(hello1==hello2);
		System.out.println();
		System.out.println("동등성비교 equals()");
		System.out.println(hello1.equals(hello2));

	}
}
