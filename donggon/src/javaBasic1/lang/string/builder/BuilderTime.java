package javaBasic1.lang.string.builder;


public class BuilderTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String result=" ";
		
		for (int i = 0; i < 100000; i++) {
			result += "hello";	
		}
		long endTime = System.currentTimeMillis();
		System.out.println(result);
		
		System.out.println(endTime-startTime+"ms");

	}

}
