package javaBasic1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

	//문제3 - 디데이 구하기
//	**문제 설명**
//	시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라. 실행 결과를 참고하자.
//	남은 기간: x년 x개월 x일 형식으로 출력한다.
//	디데이: x일 남은 형식으로 출력한다.
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2025, 1, 2);
		LocalDate end = LocalDate.of(2025, 1, 28);
		System.out.println("시작 : "+start);
		System.out.println("종료 : "+end);
		
		long between = ChronoUnit.DAYS.between(start, end);
		Period p = Period.between(start, end);
		System.out.println(p.getYears()+"년 "+p.getMonths()+" 개월"
				+p.getDays()+"일");
		
		System.out.println("D-day : "+between+"일");
		
		
		

	}

}
