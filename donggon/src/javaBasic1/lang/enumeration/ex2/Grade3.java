package javaBasic1.lang.enumeration.ex2;

public enum Grade3 {
	
	BASIC(10),GOLD(20),DIAMOND(30),VIP(50);
	
	private final int discount;
	
	Grade3(int discount){
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}
	public int Discount( int price) {
		return price * discount / 100;
		
	}
	

}
