package javaBasic1.lang.object.tostring;

public class ToStringMain2 {
	public static void main(String[] args) {
		Car car = new Car("테슬라Y");
		Dog dog = new Dog("시바견");
		
		System.out.println(car);
		String hexString = Integer.toHexString(System.identityHashCode(car));
		System.out.println(hexString);
		
		System.out.println(dog);

	}
	
	
}
