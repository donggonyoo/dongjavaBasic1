package javaBasic1.lang.enumeration.ex2;

public enum Grade2 {
	
	BASIC(10),GOLD(20),DIAMOND(30),VIP(50);
	
	private final int discount;
	
	Grade2(int discount){
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	

}
