package javaBasic1.nested;

import javaBasic1.nested.Shadowing.Inner;

public class ShadowingMain {

	public static void main(String[] args) {
		Shadowing s = new Shadowing();
		Inner inner = s.new Inner();
		inner.print();

	}

}
