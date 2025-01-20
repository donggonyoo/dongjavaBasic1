package javaBasic1.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

	public static void main(String[] args) {
		OffsetDateTime nowOdt = OffsetDateTime.now();
		System.out.println("nowOdt : "+nowOdt);
		
		LocalDateTime ldt  = LocalDateTime.of(2024, 6,12,12,8,20);
		OffsetDateTime ofOdt = OffsetDateTime.of(ldt, ZoneOffset.of("+09:00"));
		System.out.println("ofOdt : "+ofOdt);
		
		

	}

}
