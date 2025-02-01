package javaBasic1.lang.wrapper.test;

public class WrapperTest {

	public static void main(String[] args) {
		String str1 = "115";
		String str2 = "55";
		
		Integer integer1 = Integer.valueOf(str1);
		Integer integer2 = Integer.valueOf(str2);
		System.out.println("integer1 : "+integer1);
		System.out.println("integer2 : "+integer2);
		
		int sum1 = Integer.sum(integer1, integer2);
		System.out.println("sum : "+sum1);
		
		//두번쨰 방법
		int int1 = Integer.parseInt(str1); //Integer-->int
		int int2 = Integer.parseInt(str2);
		System.out.println("sum : "+(int1+int2));

	}

}
