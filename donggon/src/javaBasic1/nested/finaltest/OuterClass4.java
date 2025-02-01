package javaBasic1.nested.finaltest;

public class OuterClass4 {
	static private String outerInstance = "바깥인스턴스 변수";
	
	public static void myMethod(Hello hello) {
		int Instance = 10;
		hello.print();
		
		}
	public static void main(String[] args) {
		myMethod(()->{
			System.out.println(outerInstance);
		});

	}
	}

