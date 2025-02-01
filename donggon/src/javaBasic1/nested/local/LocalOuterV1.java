package javaBasic1.nested.local;

public class LocalOuterV1 {
	private String outInstanceF = "바깥클래스 필드(인스턴스 변수)";

	public void process(int param) {
		String localF = "바깥클래스의 지역 변수";

		class LocalPrint{
			//지역클래스는 바깥클래스의 코드블럭(메서드)안에 만든다
			String F = "지역클래스의 변수";

			public void printData() {
				System.out.println("F : "+F);
				System.out.println("localF : "+localF);
				System.out.println("param : "+param);
				System.out.println("outInstacneF : "+outInstanceF);}

		}
		LocalPrint localPrint = new LocalPrint();
		localPrint.printData();

	}
	public static void main(String[] args) {
		LocalOuterV1 localOuterV1 = new LocalOuterV1();
		localOuterV1.process(99);

	}


}

