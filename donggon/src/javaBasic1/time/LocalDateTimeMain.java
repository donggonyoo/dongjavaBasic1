package javaBasic1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		LocalDateTime nowDt = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(2023,11,20, 15,30,40);

		System.out.println("현재날짜 + 시간 "+nowDt);
		System.out.println("지정날짜 + 시간 "+ofDt);

		System.out.println("\n날짜 시간 분리 (toLocalDate , toLocaltime) ");
		LocalDate nowDate = nowDt.toLocalDate();
		LocalTime nowTime = nowDt.toLocalTime();
		System.out.println("현재날짜 : "+nowDate);
		System.out.println("현재시간 : "+nowTime);

		System.out.println("\n 날짜 시간 합체");
		LocalDateTime nowDt2 = LocalDateTime.of(nowDate, nowTime);
		System.out.println("현재 날짜 + 시간2 : "+nowDt2);

		//계산 (불변)
		System.out.println("\n 계산은 불변 (객체 반환 필수)");
		LocalDateTime plus = ofDt.plusYears(1).plusDays(8).plusHours(7);
		System.out.println("(지정날짜+시간) + 1년 8일 7시간 " +plus);

		System.out.println("\n 비교");
		System.out.println("현재날짜가 지정날짜보다 이전인가? : "+ nowDt.isBefore(ofDt));
		System.out.println("현재날짜가 지정날짜보다 이후인가? : "+ nowDt.isAfter(ofDt));
		System.out.println("현재날짜와 지정날짜가 같은가? "+nowDt.isEqual(ofDt));
	}
}
