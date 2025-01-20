package javaBasic1.time.test;

import java.time.LocalDateTime;

public class Ex1 {
//	**문제 설명**
//
//	2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
//
//	`TestPlus` 클래스에 문제를 풀어라.
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2024, 1,1,0,0,0);
		LocalDateTime plus = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
		System.out.println("변경 전 : "+ldt);
		System.out.println("변경 후 : "+plus);

	}





}
