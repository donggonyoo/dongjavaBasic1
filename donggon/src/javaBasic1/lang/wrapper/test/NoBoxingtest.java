package javaBasic1.lang.wrapper.test;

public class NoBoxingtest {
	
	public static void main(String[] args) {
		String str = "199";
		Integer integer = Integer.valueOf(str);
		System.out.println(integer); //String -> Integer
		
		int intValue = integer.intValue(); //Integer --> int
		System.out.println(intValue);
		
		Integer valueOf = Integer.valueOf(intValue); //int --> Integer
		System.out.println(valueOf);
		
		String valueOf2 = String.valueOf(integer); //Integer-->String
		System.out.println("String.valueof+1 : "+valueOf2+1);
		

	}

}
