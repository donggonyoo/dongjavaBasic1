package javaBasic1.exception.ex;

import java.util.Scanner;

public class NetworkMainV1_1 {
	public static void main(String[] args)throws Exception{
		NetworkServiceV1_1 networkServiceV1 = new NetworkServiceV1_1();
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("전송한 문자 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				break;
			}
			networkServiceV1.sendMessage(input);
			System.out.println();
			
			
		}
		System.out.println("종료");
	}

}
