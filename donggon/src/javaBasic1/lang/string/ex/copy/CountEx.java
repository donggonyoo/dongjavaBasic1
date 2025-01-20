package javaBasic1.lang.string.ex.copy;

public class CountEx {

	public static void main(String[] args) {
		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";
		
		int count = 0;
		int index = str.indexOf(key);
		
		System.out.println(index); 
		
		int index1 = str.indexOf(key,(index+1));
		System.out.println(index1);  //count ==1
		
		int index2 = str.indexOf(key,(index1+1));
		System.out.println(index2);//count ==2
		
		int index3 = str.indexOf(key,(index2+1));
		System.out.println(index3);//count ==3  -->  index가 -1 이 되면서 루프종료
		
		while(index>=0) {
			index = str.indexOf(key,(index+1)); //key를 찾은 인덱스 +1 부터 찾음(중복방지)
			
			count++;
		}
		
		System.out.println("count : "+count);
		
		
		
		
		
	}

}
