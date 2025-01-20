package javaBasic1.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

	public static void main(String[] args) {
		int i = 0;
		ChronoUnit[] values = ChronoUnit.values();
		for (ChronoUnit chronoUnit : values) {
			i++;
			System.out.println(i+"."+chronoUnit);
		}
		System.out.println("\nHOURS : "+ChronoUnit.HOURS);
		System.out.println("HOURS.Duration : "+
		ChronoUnit.HOURS.getDuration().getSeconds());
		
		System.out.println("DAYS : "+ChronoUnit.DAYS);
		System.out.println("DAYS.duration : "+
		ChronoUnit.DAYS.getDuration().getSeconds());
		
		System.out.println("\n 차이구하기");
		LocalTime lt1 = LocalTime.of(15, 0);
		LocalTime lt2 = LocalTime.of(22, 0);
		
		long sBetween = ChronoUnit.SECONDS.between(lt1, lt2);
		long MBetween = ChronoUnit.MINUTES.between(lt1, lt2);
		System.out.println("1. "+lt1);
		System.out.println("2. "+lt2);
		System.out.println("몇초 차이인가 ? "+sBetween);
		System.out.println("몇분 차이인가 ? "+MBetween);
		
		

	}

}
