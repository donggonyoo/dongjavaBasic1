package javaBasic1.nested.anonymous.ex;

import java.util.Random;

public class Ex1_RefMainRamda {
	static int a;
	private static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료\n");

	}
	public static void main(String[] args) {
		hello(()->{
			a = new Random().nextInt(6)+1;
			System.out.println("주사위 : "+a);
		});
		hello(()->{
			System.out.println("주사위의 합을 구해봐요");
		});
		
		hello(()-> {
			int sum = 0;
			for (int i = 1; i <= a; i++) {
				sum+=i;
				System.out.print(i);
				if(i != a) {
					System.out.print("+");
				}
				else {
					System.out.print("=");
				}
			}System.out.println(sum);
		});
		


	}

}
