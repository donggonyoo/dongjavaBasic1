package javaBasic1.nested.local;

public class LocalOuterV2 {
	private String outInstanceF = "바깥클래스 필드";

	public void process(int param) {
		String localF = "바깥클래스의 지역 변수";

		class LocalPrint implements Printer{
			String F = "지역클래스의 변수";
			@Override
			public void print() {
				System.out.println("F : "+F);
				System.out.println("localF : "+localF);
				System.out.println("param : "+param);
				System.out.println("outInstacneF : "+outInstanceF);

			}	
		}
		LocalPrint localPrint = new LocalPrint();
		localPrint.print();

	}
	public static void main(String[] args) {
		LocalOuterV1 localOuterV1 = new LocalOuterV1();
		localOuterV1.process(99);

	}

}
