package javaBasic1.lang.enumeration.ex2;

import java.util.Scanner;


public class Enum_Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 가격 입력 : ");
		int price = scan.nextInt();
		
		String nextLine = scan.nextLine();
		printDiscount(Grade3.BASIC, price);
		printDiscount(Grade3.GOLD, price);
		printDiscount(Grade3.DIAMOND, price);
		printDiscount(Grade3.VIP, price);
			

	}
	public static void printDiscount(Grade3 grade,int price) {
		System.out.println("grade : "+grade.name() +
				" 할인액 : "+grade.Discount(price));
	}

}
