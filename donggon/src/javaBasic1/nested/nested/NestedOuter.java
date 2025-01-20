package javaBasic1.nested.nested;

public class NestedOuter {
	
	private int outInstanceValue = 1;
	private static int outClassValue = 2;
	
	static class Nested{
		private int nestedInstanceValue=3;
		
		public void print() {
			System.out.println(nestedInstanceValue);//자신의 변수에접근
			
		//바깥 클래스의 인스턴스 멤버에는 접근 X
//			System.out.println(outInstanceValue); 
			
			//바깥클래스의 클래스멤버(정적변수)에는 접근 가능. private도 접근가능
			System.out.println(NestedOuter.outClassValue);
			
			//그냥 변수명으로도 접근 가능
			System.out.println(outClassValue);
			
			
		}
	}
	

}
