package javaBasic1.exception.ex4;

import java.util.Scanner;

import javaBasic1.exception.ex4.exception.SendExceptionV4;


public class NetworkMainV4 {
	public static void main(String[] args){
		NetworkServiceV4 networkServiceV4 = new NetworkServiceV4();
		Scanner scan = new Scanner(System.in);
	

		while(true) {
			System.out.println("전송한 문자 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				System.out.println(" 종료 ");
				break;
			}
			try {
			networkServiceV4.sendMessage(input);}
			catch(Exception e) {
				exceptionHandler(e);
			}
			System.out.println();
			
		}
		
	}
	//공통 예외 처리
	private static void exceptionHandler(Exception e) { //Exception == 모든 예외의 부모
	//공통 처리
	System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
	System.out.println("==개발자용 디버깅 메시지==");
//	e.printStackTrace(System.out); // 스택 트레이스 출력
	e.printStackTrace(); // System.err에 스택 트레이스 출력
	
	//필요하면 예외 별로 별도의 추가 처리 가능
	if (e instanceof SendExceptionV4 sendEx) { //SendExceptionV4만 추가로 처리함
		
	System.out.println("(추가처리)[전송 오류] 전송 데이터: " + sendEx.getDate());
	}
	}

}
