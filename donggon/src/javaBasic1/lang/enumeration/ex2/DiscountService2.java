package javaBasic1.lang.enumeration.ex2;

public class DiscountService2 {
	public int discountService(Grade2 grade , int price) {
		return price * grade.getDiscount()/100;
	}
	

}
