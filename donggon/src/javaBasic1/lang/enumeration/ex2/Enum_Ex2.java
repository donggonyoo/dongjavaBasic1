package javaBasic1.lang.enumeration.ex2;

public class Enum_Ex2 {
	public static void main(String[] args) {
		DiscountService2 dis = new DiscountService2();
		int price = 10000;
		int basicDis = dis.discountService(Grade2.BASIC, price);
		int goldDis = dis.discountService(Grade2.GOLD, price);
		int diamondDis = dis.discountService(Grade2.DIAMOND, price);
		int vipDis = dis.discountService(Grade2.VIP, price);
		
		System.out.println("basic : "+basicDis);
		System.out.println("GOLD : "+goldDis);
		System.out.println("DIA : "+diamondDis);
		System.out.println("VIP : "+vipDis);

	}

}
