package javaBasic1.nested.finaltest;

public class OuterClass2 {
	String value= "바깥클래스의 인스턴스변수";

	class InnerClass{
		public void hello() {
			System.out.println(InnerClass.class);
			System.out.println("InnerClass의 메서드 hello");
			System.out.println(value);
			
		}
	}
}
