package javaBasic1.lang.object.tostring;

public class ToStringMain2 {
	public static void main(String[] args) {
		Car car = new Car("테슬라Y");
		Dog dog = new Dog("시바견");
		
		System.out.println("car : "+car);
		System.out.println("dog : "+dog);
		
		
		System.out.println("\n"
				+ "toString 된 객체의 참조값 반환");
		String hexString = Integer.toHexString(System.identityHashCode(car)); 
		String hexString2 = Integer.toHexString(System.identityHashCode(dog));
	
		System.out.println("car.toH"
				+ "exString : "+hexString);
		System.out.println("dog.toHexString : "+hexString2);
		
		

	}
	
	
}
