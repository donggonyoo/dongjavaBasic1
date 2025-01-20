package javaBasic1.exception.ex;

import java.util.Scanner;

public class NetworkMainV1_3 {
	public static void main(String[] args)throws Exception{
		NetworkServiceV1_3 networkServiceV1_3 = new NetworkServiceV1_3();
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("전송한 문자 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				break;
			}
			networkServiceV1_3.sendMessage(input);
			System.out.println();
			
			
		}
		System.out.println("종료");
	}

}
