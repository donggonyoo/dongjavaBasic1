package javaBasic1.lang.string.Immutable.address;

public class AddressMain {
	public static void main(String[] args) {
		ImmutableAddress i1 = new ImmutableAddress("서울");
		ImmutableAddress i2 = i1; //주소값 복사
		System.out.println(i2);
		String i2String = Integer.toHexString(System.identityHashCode(i2));
		System.out.println("주소값 : "+i2String);
		
		
		
//		i2.setValue(); 필드를 final로 바꾸지못하게막아놈
		System.out.println("서울 --> 부산");
		i2 = new ImmutableAddress("부산");//새로운인스턴스를 만들어 반환해야함
		System.out.println(i2);
		String i2String2 = Integer.toHexString(System.identityHashCode(i2));
		System.out.println("주소값 : "+i2String2);

	}

}
