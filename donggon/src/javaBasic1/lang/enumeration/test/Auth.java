package javaBasic1.lang.enumeration.test;

public class Auth {
	
	public static void type(String auth){
		AuthGrade valueOf = AuthGrade.valueOf(auth.toUpperCase());//항상대문자로만들어줌
		//B.valueOf(a); a를 B타입으로반환해줌(잘못된 인자 전달 시 오류)
		System.out.println("당신의 권한  : "+valueOf.getDescription());
		System.out.println("== 메뉴 목록 ==");
		
		if(valueOf.getLevel()==1) {
			System.out.println(" -메인화면");
		}
		else if(valueOf.getLevel()==2) {
			System.out.println(" -메인화면 \n -이메일관리화면");
		}
		else if(valueOf.getLevel()==3) {
			System.out.println(" -메인화면 \n -이메일관리화면 \n -관리자화면");
		}
		
		
	}

}
