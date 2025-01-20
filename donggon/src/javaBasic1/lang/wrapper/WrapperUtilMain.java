package javaBasic1.lang.wrapper;

public class WrapperUtilMain {

	public static void main(String[] args) {
		int a = 10;
		String b = "20";
		
		Integer i1 = Integer.valueOf(a);
		Integer i2 = Integer.valueOf(b);
		
		int bb = Integer.parseInt(b);
		
		//비교연산
		int compareTo = i1.compareTo(bb);
		System.out.println(" i1 compareTo bb : "+compareTo);
		
	
		//연산
		int sum = Integer.sum(i1, i2);
		System.out.println("i1 + i2 = "+sum);
		
		int min = Integer.min(i1, i2);
		System.out.println("min = "+min);
		
		int max = Integer.max(i1, i2);
		System.out.println("max = "+max);
		

	}

}
