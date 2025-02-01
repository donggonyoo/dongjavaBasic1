package javaBasic1.nested.inner.ex1;

public class Car {
	private String model;
	private int chargeLevel;
	private CarEngine engine;
	
	public Car(String model,int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new CarEngine(); 
		//바깥 클래스에서 내부클래스 인스턴스생성 시 :  new 내부클래스() 가능!
		
	}
	public void start() {
		engine.start();
		System.out.println(model+"시작 완료");
		
	}
	private class CarEngine{//오직Car클래스에서만 접근가능
		private void start() {
			System.out.println("차량 충전 레벨 :"+chargeLevel);
			System.out.println(model+"의 엔진 구동!");
			
		}
	}
	

}
