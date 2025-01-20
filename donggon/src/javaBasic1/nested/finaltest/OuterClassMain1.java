package javaBasic1.nested.finaltest;

import javaBasic1.nested.finaltest.OuterClass1.NestedClass1;

public class OuterClassMain1 {

	public static void main(String[] args) {
		NestedClass1 nested = new OuterClass1.NestedClass1();
		nested.hello();

		NestedClass1 nestedClass1 = new NestedClass1();
		nestedClass1.hello();
	}

}
