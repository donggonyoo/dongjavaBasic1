package javaBasic1.nested.nested;

import javaBasic1.nested.nested.NestedOuter.Nested;

public class NestedOuterMain {

	public static void main(String[] args) {
		NestedOuter nestedOuter = new NestedOuter();
		Nested nested = new NestedOuter.Nested();
		
		nested.print();
		
	}
}
