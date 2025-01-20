package javaBasic1.lang.string.method;

public class MethodMain {

	public static void main(String[] args) {

		String str = "donggon, java!!";
		System.out.println("문자열의 길이: " + str.length());
		System.out.println("문자열이 비어 있는지: " + str.isEmpty());
		System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank()); //Java11
		System.out.println("문자열이 비어 있거나 공백인지2: " + " ".isBlank());
		char c = str.charAt(7);
		System.out.println("7번 인덱스의 문자: " + c);

	}

}
