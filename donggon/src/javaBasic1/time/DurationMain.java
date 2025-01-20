package javaBasic1.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

	public static void main(String[] args) {
		Duration duration = Duration.ofMinutes(40);
		System.out.println("duration : "+duration);
		
		LocalTime lt = LocalTime.of(4,0);
		System.out.println("기준시간 : "+lt);
		
		LocalTime plus = lt.plus(duration);
		System.out.println("기준시간 + duration : "+plus);
		
		LocalTime start = LocalTime.of(8, 0);
		LocalTime end = LocalTime.of(15, 30);
		Duration between = Duration.between(start, end);
		System.out.println("시작 시간 : "+start);
		System.out.println("종료 시간 : "+end);
		System.out.println("차이(초) : "+between.getSeconds());
		System.out.println("시간 차 : "+between.toHours()+"시간 "+
		between.toMinutesPart()+"분 ");
		
		
		
		
		

	}

}
