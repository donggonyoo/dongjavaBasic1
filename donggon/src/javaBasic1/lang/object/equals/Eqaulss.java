package javaBasic1.lang.object.equals;

public class Eqaulss {
	public static void main(String[] args) {
		
		Hello hello1 = new Hello("Hi");
		Hello hello2 = new Hello("Hi"); //둘은 참조값이 다름  (인스턴스를 공유하지않기때문)
		
		System.out.println("hello1.hashCode() : "+hello1.hashCode());
		System.out.println("hello2.hashCode() : "+hello2.hashCode());
		
		System.out.println("동일성 비교 '=='");
		System.out.println(hello1==hello2);
		System.out.println();
		System.out.println("동등성비교 equals()");
		System.out.println(hello1.equals(hello2));

	}
}
