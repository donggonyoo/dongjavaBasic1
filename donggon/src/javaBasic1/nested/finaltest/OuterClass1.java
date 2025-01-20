package javaBasic1.nested.finaltest;

public class OuterClass1 {
	int value= 10;

	static class NestedClass1{
		public void hello() {
			System.out.println(NestedClass1.class);
			System.out.println("NestedClass1의 메서드 hello");
			
		}
	}
}
