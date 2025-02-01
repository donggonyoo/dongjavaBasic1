package javaBasic1.lang.enumeration.test;


public class AuthGradeMain1 {

	public static void main(String[] args) {
		printAuth(AuthGrade.GUEST);
		printAuth(AuthGrade.LOGIN);
		printAuth(AuthGrade.ADMIN);
		
		

	}
	private static void printAuth(AuthGrade auth) {
		//name은 enum에서 제공하는 메서드
		System.out.println(auth.name()+"| level : "+auth.getLevel()+
				" | description : "+auth.getDescription());
		
	}

}
