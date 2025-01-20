package javaBasic1.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

	public static void main(String[] args) {
		Period period = Period.ofDays(10);
		System.out.println("period "+period);
		
		System.out.println("\n 계산");
		LocalDate ldt = LocalDate.of(2024, 4, 5);
		LocalDate plus = ldt.plus(period);
		System.out.println("지정날짜 : "+ldt);
		System.out.println("지정날짜 + period : "+plus);
		
		System.out.println("\n 기간차이");
		LocalDate now = LocalDate.now();
		Period between = Period.between(ldt, now);
		System.out.println("지정날짜  : "+ldt);
		System.out.println("현재날짜  : "+now);
		
		System.out.println("기간 : "+between.getMonths()
		+"개월 "+between.getDays()+"일");
		
		LocalDate start = LocalDate.of(2024, 12, 21);
		LocalDate end = LocalDate.of(2025, 1, 9);
		Period per = Period.between(start, end);
		System.out.println(per);
		

	}

}
