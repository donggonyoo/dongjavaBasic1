package javaBasic1.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		int value = 8;
//		Integer boxed = Integer.valueOf(value);
		Integer boxed = value; //오토박싱
		int compareTo = boxed.compareTo(9);
		System.out.println(compareTo); //크면 1 같으면 0 작으면 -1 반환
		
//		int unboxed = integer.intValue(); 
		int unboxed = /* (int) */boxed; // 오토 언박싱
		//기본형은 compareto 같은 메서드사용x
		
		System.out.println("boxed : "+boxed);
		System.out.println("unboxed : "+unboxed);
		

	}

}
