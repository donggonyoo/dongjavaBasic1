package javaBasic1.lang.enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.print("Http Code(0입력시 반복종료) :");
			int code = scan.nextInt();
			if(code==0) {
				System.out.println("code검증 종료");
				break;
			}
			HttpStatus byCode = HttpStatus.findByCode(code);

			if(byCode==null) {
				System.out.println("잘못된코드임");
			}
			else {
				System.out.println(byCode.getCode()+" "+byCode.getMessage());
				System.out.println("isSucess : "+byCode.isSucess(code));
			}
		}
	}
}


