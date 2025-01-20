package javaBasic1.lang.string.builder;


public class StringTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) {
			sb.append("hello");	
		}
		String result = sb.toString();
		
		long endTime = System.currentTimeMillis();
		System.out.println(result);
		
		System.out.println(endTime-startTime+"ms");

	}

}
