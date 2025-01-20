package javaBasic1.lang.string.ex.copy;

public class SrtToInt {
	public static void main(String[] args) {
		String str = "12345";
		System.out.println("str : "+str);
		
		int sum=0;
		String[] split = str.split("");
		for (String string : split) {
			int int1 = Integer.parseInt(string);
			sum+=int1;
		}
		System.out.println("각 자릿수 합 : "+sum);
		
		
		int day = getDay("23/10/05");
		System.out.println(day);
		
		String substring = str.substring(1);
		System.out.println(substring);
	
		
		
		
	}
	public static  int getDay(String date) {
		  String day = date.substring(date.lastIndexOf("/") + 1);//6이란의미
		  
		  return Integer.parseInt(day);
		}

}
