package javaBasic1.exception.ex;

import java.util.Scanner;

public class NetworkMainV1_2 {
	public static void main(String[] args)throws Exception{
		NetworkServiceV1_2 networkServiceV1_2 = new NetworkServiceV1_2();
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("전송한 문자 : ");
			String message = scan.nextLine();
			if(message.contains("exit")) {
				break;
			}
			networkServiceV1_2.sendMessage(message);
			System.out.println();	
		}
		System.out.println("종료");
	}

}
