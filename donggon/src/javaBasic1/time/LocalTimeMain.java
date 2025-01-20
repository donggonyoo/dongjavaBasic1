package javaBasic1.time;

import java.time.LocalTime;

public class LocalTimeMain {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		LocalTime ofTime = LocalTime.of(10,20,40);
		
		System.out.println("현재시간 : "+nowTime);
		System.out.println("지정시간 : "+ofTime);
		
		//계산
		LocalTime plusHM = ofTime.plusHours(4).plusMinutes(30);
		System.out.println("시간역시 불변 !! 객체생성해 반환");
		System.out.println("지정시간 + 4시간30분"+ " : "+plusHM);
		
	}

}
