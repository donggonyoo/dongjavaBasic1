package javaBasic1.lang.string.method;

public class MethodEqauls {
	public static void main(String[] args) {
		String str1 = "HelLo, JavA!"; //대문자 일부 있음
		String str2 = "hello, java!"; //대문자 없음 모두 소문자
		String str3 = "Hello, World!";
		System.out.println("str1 equals str2: " + str1.equals(str2));
		System.out.println("str1 equalsIgnoreCase str2: " +
		str1.equalsIgnoreCase(str2));
		
		System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // b와a가 얼마나 차이나냐?
		System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
		System.out.println("str1 compareToIgnoreCase str2: " +
		str1.compareToIgnoreCase(str2));
		
		System.out.println("str1 starts with 'Hello': " +
		str1.startsWith("HelLo"));
		System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
		}

}
