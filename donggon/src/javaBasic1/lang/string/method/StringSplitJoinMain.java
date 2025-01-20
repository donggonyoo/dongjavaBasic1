package javaBasic1.lang.string.method;

public class StringSplitJoinMain {
	public static void main(String[] args) {
		String str = "Apple__Banana__Orange";
		// split()
		String[] splitStr = str.split("__"); //__을 기준으로 나눈다!
		for(String s : splitStr) {
		System.out.println(s);
		}
		// join()
		String joinedStr = String.join("@@", "A", "B", "C");
		System.out.println("연결된 문자열: " + joinedStr);
		
		// 문자열 배열 연결
		String result = String.join("**", splitStr);
		System.out.println("result = " + result);

	}

}
