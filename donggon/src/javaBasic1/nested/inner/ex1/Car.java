package javaBasic1.nested.inner.ex1;

public class Car {
	private String model;
	private int chargeLevel;
	private CarEngine engine;
	
	public Car(String model,int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new CarEngine();
		
	}
	public void start() {
		engine.start();
		System.out.println(model+"시작 완료");
		
	}
	private class CarEngine{
		private void start() {
			System.out.println("차량 충전 레벨 :"+chargeLevel);
			System.out.println(model+"의 엔진 구동!");
			
		}
	}
	

}
