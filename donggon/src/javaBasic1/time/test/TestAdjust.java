package javaBasic1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjust {

	public static void main(String[] args) {
		int year = 2025;
		int month = 1;
		int day = 1;
		
		LocalDate date = LocalDate.of(year, month, 1);
		DayOfWeek first = date.getDayOfWeek();
		DayOfWeek first2 = date.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
		DayOfWeek last = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
		
		
		System.out.println("첫날 요일 : "+first);
		System.out.println("첫날 요일(다른방법) : "+first2);
		
		System.out.println("마지막  요일 : "+last);
	
		
	}

}
