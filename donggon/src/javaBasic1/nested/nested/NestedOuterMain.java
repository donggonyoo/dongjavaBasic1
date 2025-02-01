package javaBasic1.nested.nested;

import javaBasic1.nested.nested.NestedOuter.Nested;

public class NestedOuterMain {

	public static void main(String[] args) {
		// new 바깥클래스.정적클래스() 로 생성
		NestedOuter nestedOuter = new NestedOuter();
		System.out.println("new NestedOuter.Nested()");
		Nested nested = new NestedOuter.Nested();
		System.out.println("nested : "+nested);
		//클래스정보 : 패키지.바깥클래스$정적중첩클래스
		nested.print();
		
	
		//그냥 new 정적클래스 도 생성가능.( 같은클래스 안에 있지만 다른 인스턴스영역임)
		System.out.println("\n"
				+ "new Nested()로 생성 가능");
		Nested nested2 = new Nested();
		System.out.println("nested2 : "+nested2);
		nested2.print();
		
//		nested.print();
		
	}
}
