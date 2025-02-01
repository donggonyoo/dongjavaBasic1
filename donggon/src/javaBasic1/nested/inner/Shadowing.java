package javaBasic1.nested.inner;

public class Shadowing {
	private String value ="바깥클래스 필드";
	
	public void outMethod() {
		System.out.println("바깥클래스의 메서드");
	}
	
	public class Inner{
		private String value = "내부클래스 필드";
		
		public void print() {
			//지역변수는 접근제어자 쓰면 안됨
			String value ="내부클래스의 지역변수";
			System.out.println("value : "+value);//지역변수
			System.out.println("this.value : "+this.value); //자신의클래스 인스턴스 멤버(변수)
			System.out.println("ShadowingMain.value : "+Shadowing.this.value);//바깥클래스의 인스턴스멤버(변수)
			//그냥 변수명을 처음부터 다르게설정하는게 베스트!!!!
			outMethod();
			
			
			
		}
	}
}
