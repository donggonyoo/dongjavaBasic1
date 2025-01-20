package javaBasic1.lang.string.ex.copy;

public class ArrEx {

	public static void main(String[] args) {
		String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
		int result =0;
		for (String string : arr) {
			result += string.length();
			System.out.println(string +" : "+string.length());
		}
		System.out.println("총 length : "+result);	

	}

}
