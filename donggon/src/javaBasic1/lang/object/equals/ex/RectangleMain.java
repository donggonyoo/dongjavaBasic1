package javaBasic1.lang.object.equals.ex;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(100, 30);
		
		System.out.println("equals구현여부");
		System.out.println("r1.equals(r2) : "+r1.equals(r2));
		

	}
}
