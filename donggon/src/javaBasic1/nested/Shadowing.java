package javaBasic1.nested;

public class Shadowing {
	private String value ="바깥클래스 필드";

	class Inner{
		private String value = "내부클래스 필드";
		
		public void print() {
			//지역변수는 접근제어자 쓰면 안됨
			String value ="내부클래스의 지역변수";
			System.out.println("value : "+value);
			System.out.println("this.value : "+this.value);
			System.out.println("ShadowingMain.value : "+Shadowing.this.value);
			
		}
	}
}
