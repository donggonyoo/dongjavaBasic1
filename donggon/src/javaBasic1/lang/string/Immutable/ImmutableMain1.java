package javaBasic1.lang.string.Immutable;

public class ImmutableMain1 {

	public static void main(String[] args) {
		String str1 = "my name is";
		String str2 = "donggon";
		System.out.println("변경 전 str1 : "+str1);
		System.out.println("str2 : "+str2+"\n");
		String concat = str1.concat(" "+str2);
		//str1뒤에str2를 이어 붙임 ..( 꼭 객체를 반환해야함 ) ( String객체는 불변)
		
		System.out.println("@@str1.concat(str2)@@");
		System.out.println("변경 후 str1 "+str1);
		System.out.println("변경 후 반환값 : "+concat);
		

	}

}
