package javaBasic1.time.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class GudiTest {
//	2024-12-25T12:00:00" 날짜/시간 정보를 다음에 제시된 문자열 형식의 날짜로 변환하여 출력하시오.
//
//	문자열 "2024-12-25T12:00:00" 정보를 "2024.12.25. 12:00:00" 형식으로 변환하여 출력하시오. 날짜와 시간 사이에는 공백이 하나 포함되도록 처리하시오.
//
//	[결과]
//	2024.12.25. 12:00:00
	public static void main(String[] args) {
		String str = "2024-12-25T12:00:00";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime dt = LocalDateTime.parse(str,f);
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm:ss");
		String format = dt.format(f2);
		System.out.println(format);
		
	}

}
