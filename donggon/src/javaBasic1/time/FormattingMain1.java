package javaBasic1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("현재날짜 : "+ld);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		String format = ld.format(formatter);
		System.out.println("format : "+format);
		
		String input = "2023년 10월 04일";
		LocalDate parse = LocalDate.parse(input,formatter);
		System.out.println("parse : "+parse);
		
		LocalDateTime ldt = LocalDateTime.of(2024, 10,20,13,30,00);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String format2 = ldt.format(formatter2);
		System.out.println("ldt : "+ldt);
		System.out.println("format2 :"+format2);
		
		String input2 = "2000년 11월 20일 13시 20분 45초";
		LocalDateTime parse2 = LocalDateTime.parse(input2,formatter2);
		System.out.println("input : "+input2);
		System.out.println("parse2 : "+parse2);

	}

}
