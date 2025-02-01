package javaBasic1.nested.anonymous.ex;

import java.util.Random;

public class Ex1_RefMain_static {
	static int a;
	public static void hello(Process process)  {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료\n");
	}
	static class Dice implements Process{
		@Override
		public void run() {
			Random random = new Random();
			a = random.nextInt(1, 6);
			System.out.println("주사위 : "+a);
		}
	}
	static class Sum implements Process{
		int sum;

		@Override
		public void run() {
			for (int i = 1; i <= a; i++) {
				System.out.print(i);
				sum+=i;
				if(i!=a) {
					System.out.print("+");
				}
				else {
					System.out.print("=");
				}
			}
			System.out.println(sum);
		}
		
	}
	public static void main(String[] args) {
		Dice dice = new Dice();
		Sum sum = new Sum();
		hello(dice);
		hello(sum);
	}

}
