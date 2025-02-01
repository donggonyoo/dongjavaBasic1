package javaBasic1.lang.string.Immutable.change;

public class ImmutableMain {
	public static void main(String[] args) {
		ImmutableObj i1 = new ImmutableObj(5);
		System.out.println("@@ 불변객체의 값을 변경하려면 이 방법 뿐! @@");
		System.out.println("i1의 주소값 : "+i1);
		System.out.println("i1의 count : "+i1.getCount());
		
		ImmutableObj i1Add = i1.add(10);
		System.out.println("\ni1.add(10) 으로 새로운객체반환");
		System.out.println("i1Add의 주소값 : "+i1Add);
		System.out.println("i1Add의 count : "+i1Add.getCount());
		
		System.out.println("결론 : 둘은완전히 다른 객체가 됨");
		
		

	}

}
