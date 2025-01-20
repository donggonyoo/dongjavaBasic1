package javaBasic1.nested.anonymous.ex;

import java.util.Random;

public class Ex1_RefMain {
	static int a;
	private static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료\n");

	}
	public static void main(String[] args) {
		hello(new Process() {

			@Override
			public void run() {
				a=new Random().nextInt(6)+1;
				System.out.println("주사위 : "+a);

			}
		}); 


		hello(new Process() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i <= a; i++) {
					sum+=i;
					System.out.print(i);
					if(i != a) {
						System.out.print("+");
					}



				}System.out.println("\n주사위의 합 : "+sum);

			}
		});
	}

}
