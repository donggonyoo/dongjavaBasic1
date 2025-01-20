package javaBasic1.lang.enumeration.ex;

public class DiscountService {
	
	public int discount(Grade grade , int price) {
		int discountPercent  = 0;
		
		switch (grade) {
		case BASIC:
			discountPercent = 10;
			break;
		case GOLD : 
			discountPercent = 20;
			break;
		case DIAMOND :
			discountPercent = 30;
			break;

		default:
			System.out.println("할인X");
			break;
			
		}
		return price * discountPercent / 100;
		
		
	}

}
