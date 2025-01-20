package javaBasic1.lang.enumeration.test;

import java.util.Scanner;

public class AuthMain2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("등급을 입력하세요[GUEST , LOGIN , ADMIN ] : ");
		String grade = scan.nextLine();
		Auth.type(grade);
		
		
		
		


	}

}
