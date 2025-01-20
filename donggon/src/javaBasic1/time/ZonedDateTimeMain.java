package javaBasic1.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

	public static void main(String[] args) {
		ZonedDateTime nowZDt = ZonedDateTime.now();
		System.out.println(nowZDt);
		
		LocalDateTime ldt = LocalDateTime.of(2021,11,20,15,10,40);
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
		System.out.println("zdt : "+zdt);
		
		ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println("zdt2 : "+zdt2);
		
		
		

	}

}
