package javaBasic1.exception.basic.checked;

public class Service {
	
	Client client = new Client();
	
	public void callCatch() {
//		예외를 잡아서 
//		처리하는코드
		try {
			client.call();
			
		} catch (MyCheckedException e) {
			System.out.println("예외 처리 : "+e.getMessage());//getMessage가 오버라이딩됐으므로 
											//MyCheckedException의 메시지가출력
		}
		System.out.println("정상 흐름");
		
	}
	//예외를 잡지않고 던지는 코드
	public void callThrow() throws MyCheckedException{
		client.call();
	}

}
