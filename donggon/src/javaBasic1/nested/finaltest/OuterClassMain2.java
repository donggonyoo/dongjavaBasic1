package javaBasic1.nested.finaltest;


import javaBasic1.nested.finaltest.OuterClass2.InnerClass;

public class OuterClassMain2 {

	public static void main(String[] args) {
		OuterClass2 outerClass2 = new OuterClass2();
		InnerClass innerClass = outerClass2.new InnerClass();
		innerClass.hello();
	}

}
