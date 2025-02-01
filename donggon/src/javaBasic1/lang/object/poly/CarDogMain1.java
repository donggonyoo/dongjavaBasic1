package javaBasic1.lang.object.poly;

public class CarDogMain1 {
	public static void main(String[] args) {
		Car car = new Car();
		Dog dog = new Dog();
		action(car);
		action(dog);
	}

	private static void action(Object obj) {
//		obj.move();
//		obj.car();
		if(obj instanceof Car car) {
			car.move();
		}
		else if(obj instanceof Dog dog) {
			dog.sound();
		}
		else {
			System.out.println("존재하지않는객체");
		}
		
	}
	

}
