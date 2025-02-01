package javaBasic1.nested.finaltest;

public class OuterClass3 {
	String outerInstance = "바깥인스턴스 변수";
	
	public void myMethod() {
		class LocalClass{
			void hello() {
			System.out.println(LocalClass.class);
			System.out.println("LocalClass의 메서드 hello");
			System.out.println(outerInstance+"접근가능");
			System.out.println(OuterClass3.this.outerInstance);
		}
		}
		LocalClass localClass = new LocalClass();
		localClass.hello();
	}
}
