package javaBasic1.lang.enumeration.ex;

import java.util.Arrays;

public class EnumMethodMain {

	public static void main(String[] args) {
		Grade[] values = Grade.values();
		String string = Arrays.toString(values);
		System.out.println(string);
		
		String str = "GOLD";
//		String str2 = "gold";
		Grade valueOf = Grade.valueOf(str);
//		Grade valueOf2 = Grade.valueOf(str2); // 오류발생
		System.out.println("value :  "+valueOf);

//		
		

	}

}
