package javaBasic1.nested.inner;

import javaBasic1.nested.inner.Shadowing.Inner;

public class ShadowingMain {

	public static void main(String[] args) {
		Shadowing s = new Shadowing(); //바깥클래스의 인스턴스 생성 후
		Inner inner = s.new Inner();// 그 인스턴스에 내부클래스의 인스턴스를 생성할 수 있다.
		inner.print();
	

	}

}
