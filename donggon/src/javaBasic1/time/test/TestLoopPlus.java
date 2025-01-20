package javaBasic1.time.test;

import java.time.LocalDate;

public class TestLoopPlus {

	//
//			2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
	//
//			`TestLoopPlus` 클래스에 문제를 풀어라

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2024,1 , 1);
		System.out.println("변경 전 : "+ld);
		
		for (int i = 1; i < 6; i++) {
			LocalDate plusWeeks = ld.plusWeeks(2*i);
			System.out.println(i+"번쨰 변경 : "+plusWeeks);
			
			
		}

		
	}

}
