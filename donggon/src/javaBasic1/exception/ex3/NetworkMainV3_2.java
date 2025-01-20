package javaBasic1.exception.ex3;

import java.util.Scanner;


public class NetworkMainV3_2 {
	public static void main(String[] args)throws Exception{
		NetworkServiceV3_2 networkServiceV3_2 = new NetworkServiceV3_2();
		Scanner scan = new Scanner(System.in);
	

		while(true) {
			System.out.println("전송한 문자 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				System.out.println(" 종료 ");
				break;
			}
			networkServiceV3_2.sendMessage(input);
			System.out.println();
			
			
		}
		
	}

}
