package javaBasic1.lang.string.Immutable;

public class ImmutableMain1 {

	public static void main(String[] args) {
		String str1 = "my name is";
		String str2 = "donggon";
		System.out.println("변경 전 str1 : "+str1);
		String concat = str1.concat(str2);
		System.out.println("변경 후 str1 : "+concat);
		

	}

}
