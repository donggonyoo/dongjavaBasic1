package javaBasic1.lang.string.Immutable.ex;

public class ImmutableDateMain {
	public static void main(String[] args) {
		ImmutableDate date1 = new ImmutableDate(2024, 11,20);
		System.out.println("date1 :"+date1);
		String hex1 = Integer.toHexString(System.identityHashCode(date1));
		System.out.println("date1의 주소값 : "+hex1);
		
		ImmutableDate date2 = date1.setYear(2019);
		System.out.println("\n@@ date1.setYear(2019) @@");
		System.out.println("date2 :"+date2);
		String hex2 = Integer.toHexString(System.identityHashCode(date2));
		System.out.println("date2의 주소값 : "+hex2);
		
		

	}

}
