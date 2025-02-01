package javaBasic1.lang.object.tostring;

public class ToStringMain1 {

	public static void main(String[] args) {
		Object obj = new Object();
		String string = obj.toString();
		System.out.println("System.out.print은 toString을 내장하고 있음");
		System.out.println("obj : "+obj);

		System.out.println("obj.toString : "+string);
		System.out.println("\n그래도 둘은 동일하다고 보진않음.");
		System.out.println("obj와string는동일한가 ? :"+obj==string);

		
		System.out.println("\nhashCode가 다름");
		System.out.println("obj.hashCode() : "+obj.hashCode());
		System.out.println("string.hashCode() : "+string.hashCode());
	}
}
