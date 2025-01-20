package javaBasic1.lang.string.ex.copy;

public class SubStringEx {

	public static void main(String[] args) {
		String str = "hello.txt";
		int b = str.indexOf(".txt");
		System.out.println(str.substring(0, b)); //0부터b까지의부분문자열반환
		System.out.println(str.substring(b)); //b부터의 문자열반환
		

	}

}
