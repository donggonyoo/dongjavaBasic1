package javaBasic1.lang.math;

public class MyMath {
	public static void round(double num , int i) {
		double pow = Math.pow(10, i);
		//자릿수를 맞춰주는 기능 === i에 0 이들어가면 1.0으로바뀜 (0제곱)
								//i==1  10^1 =10.0
		System.out.println(Math.round(pow*num)/pow);
		//round메서드 : 소수점뒤에 반올림 실행
	}
	public static void floor(double num , int i) {
		double pow = Math.pow(10, i);
		System.out.println(Math.floor(pow*num)/pow);
		//floor메서드 : 소수점뒤에 반내림 실행
	}
	////////////////////////메인코드////////////////////////
	public static void main(String[] args) {
		double a = 5.55321;

		System.out.println("반올림");
		round(a, 0);
		round(a, 1);
		round(a, 2);
		System.out.println("반내림");
		floor(a, 0);
		floor(a, 1);
		floor(a, 2);

	}
}


