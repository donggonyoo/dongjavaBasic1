package javaBasic1.lang.enumeration.ex;

import java.util.Scanner;

public class Enum_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가격을 입력하시오(등급별 할인금액이 뜹니다) : ");
		int price = scan.nextInt();
		
		DiscountService discountService = new DiscountService();
		int basicDiscount = discountService.discount(Grade.BASIC, price);
		int goldDiscount = discountService.discount(Grade.GOLD, price);
		int diamondDiscount = discountService.discount(Grade.DIAMOND, price);
		
		System.out.println("Basic 할인금액 : "+basicDiscount);
		System.out.println("Gold 할인금액 : "+goldDiscount);
		System.out.println("Diamond 할인금액 : "+diamondDiscount);
		
		

	}

}
