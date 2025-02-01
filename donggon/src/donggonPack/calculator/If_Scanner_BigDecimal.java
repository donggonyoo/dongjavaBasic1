package donggonPack.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class If_Scanner_BigDecimal {
	Scanner scan = new Scanner(System.in);
	static BigDecimal a;
	static BigDecimal b;
	static int choose;
	
	void Calcalator() {
		System.out.print("초기숫자입력 : ");
		a = scan.nextBigDecimal();
		
		while(true) {
			System.out.print("0 : exit | 1 : + | 2 : - | "
					+ "\n 3 : * | 4 : / | 5 : ^ | ==> ");
			choose = scan.nextInt();
			if(choose==0) {
				System.out.println("종료");break;}
			
			else if(oneToFive()) {
				System.out.println("다른숫자를 입력하세요 ");
				continue;
			}
			System.out.println("숫자입력 : ");
			b = scan.nextBigDecimal();
			
			switch (choose) {
			case 1 : 
				System.out.println(a+"+"+b +"="+sum());
				break;
			case 2:
				System.out.println(a+"-"+b +"="+minus());
				break;
			case 3:
				System.out.println(a+"*"+b +"="+multiply());
				break;
			case 4 : 
				System.out.println(a+"/"+b +"="+div());
				break;
			case 5 :
				System.out.println(a+"^"+b +"="+pow());
				break;
			}
		}
	}
	
	private boolean oneToFive() {
		if(choose ==1 || choose==2 || choose==3 ||
				choose==4||choose ==5) {
			return false;
		}
		return true;
	}
	private BigDecimal sum() {
		a = a.add(b);
		return a;
	}
	
	private BigDecimal minus() {
		a = a.subtract(b);
		return a;
	}
	
	private BigDecimal multiply() {
		a = a.multiply(b);
		return a;
	}
	
	private BigDecimal div() {
		if(b.equals(0)) {
			System.out.println("0은 나눌 수 없어요");
			return a;
		}
		a = a.divide(b,3,RoundingMode.HALF_UP);
		//소수점 3개자리까지표현하고 반올림함
		return a;
	}
	
	private BigDecimal pow() {
		a = a.pow(b.intValue());
		return a;
	}
	
	

}
