package javaBasic1.nested.inner;

import javaBasic1.nested.inner.InnerOuter.Inner;

public class InnerOuterMain {

	public static void main(String[] args) {
		InnerOuter innerOuter = new InnerOuter();
		Inner inner = innerOuter.new Inner();
//		Inner inner2 = new Inner(); 불가능ㅇ
		inner.print();

	}

}
