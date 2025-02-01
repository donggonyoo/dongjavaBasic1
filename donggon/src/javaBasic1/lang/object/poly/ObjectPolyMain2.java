package javaBasic1.lang.object.poly;

public class ObjectPolyMain2 {
	public static void main(String[] args) {
		Car car = new Car();
		Dog dog = new Dog();
		Object object = new Object();
		
		Object[] obj = {car,dog,object};
		arr(obj);
		
		System.out.println("@@배열 요소들의 주소  모음@@");
		for (Object object2 : obj) {
			System.out.println(object2);
		}}
	
	
	private static void arr(Object[] obj) {
		int length = obj.length;
		System.out.println("배열의 크기 :"+length);
		
		
		
	}
	
}
