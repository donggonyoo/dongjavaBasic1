package javaBasic1.lang.string.ex.copy;

public class TrimEx {

	public static void main(String[] args) {
		String str = "     My name is doggon   ";
		
		System.out.println("'"+str+"'");
		
		String trim = str.trim();
		System.out.println("'"+trim+"'");
		
		String strip = str.strip();
		System.out.println("'"+strip+"'");

	}

}
