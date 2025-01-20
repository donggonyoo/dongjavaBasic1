package javaBasic1.exception.ex3;

import java.util.Scanner;

public class NetworkMainV3_1 {
	public static void main(String[] args)throws Exception{
		NetworkServiceV3_1 networkServiceV3 = new NetworkServiceV3_1();
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("전송한 문자 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				System.out.println(" 종료 ");
				break;
			}
			networkServiceV3.sendMessage(input);
			System.out.println();
			
			
		}
		
	}

}
