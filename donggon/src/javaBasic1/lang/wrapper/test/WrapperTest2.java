package javaBasic1.lang.wrapper.test;

public class WrapperTest2 {

	public static void main(String[] args) {
		String [] array1 = new String[] {"2.5","1.2","3.2","6.7"};
		double sum = 0;
		for (String s : array1) {
			sum+=Double.parseDouble(s);
		}
		System.out.printf("sum : %.2f ",sum);


	}

}
