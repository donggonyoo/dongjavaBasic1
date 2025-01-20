package javaBasic1.time;

import java.time.LocalDate;

 class LocalDateMain {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalDate ofDate = LocalDate.of(2024,12,21);
		
		System.out.println("현재 날짜 : "+nowDate);
		System.out.println("지정 날짜 : "+ofDate);
		
		LocalDate plusDays = ofDate.plusDays(20);
		System.out.println("날짜는 불변이다 --> 새로운객체를 만들어반환해야함");
		System.out.println("지정날짜 + 20 : "+plusDays);
		

	}

}
