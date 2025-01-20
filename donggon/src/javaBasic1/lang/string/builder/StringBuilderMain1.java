package javaBasic1.lang.string.builder;

public class StringBuilderMain1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("my ").append("name ").append("is Donggon").toString();
		System.out.println("sb : "+sb);
		
		sb.insert(2, "하하");//2번인덱스에 "하하"추가
		System.out.println("sb : "+sb);
	
		sb.delete(2, 4);//2번인덱스 ~ 3번인덱스 ( 4번은삭제X) 까지 삭제
		System.out.println("sb : "+sb);
		
		sb.replace(0, 4, "헤헤"); //0번부터 3번인덱스를지우고 해당 문자열로 변경
		System.out.println("sb : "+sb);
		
		sb.reverse();
		System.out.println("sb : "+sb);
		
		String string = sb.toString(); //불변객체로 다시 만듬
		System.out.println(string);
		
		

	}

}
