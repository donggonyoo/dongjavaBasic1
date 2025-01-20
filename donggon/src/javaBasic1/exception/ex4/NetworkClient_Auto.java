package javaBasic1.exception.ex4;

import javaBasic1.exception.ex4.exception.ConnectExceptionV4;
import javaBasic1.exception.ex4.exception.SendExceptionV4;

public class NetworkClient_Auto  implements AutoCloseable{ //close()사용위해 AutoCloseable 구현
	private final String address;
	private boolean connectError;
	private boolean sendError;
	private boolean testError;

	public NetworkClient_Auto(String address) {
		this.address = address;
	}
	public void connect(){
		if(connectError) {
			throw new ConnectExceptionV4("connectError  ", address+ "서버에 연결 실패  ");
		}System.out.println(address+" 연결 성공");
	}


	public void send(String data) {
		if(sendError) {
			throw new SendExceptionV4("sendError  ","  데이터 전송 실패 : "+data);
		}
		
		System.out.println(address+"데이터 전송 성공 : "+data);
	}
	public void test(){
		if(testError) {
			throw new RuntimeException(address+"test실패");
		}
		System.out.println("RunTime 테스트정상");
	}


	public void disconnect() {
		System.out.println(address+" 서버연결해제");
	}
	
	@Override
	//AutoCloseable` 인터페이스가 제공하는 이 메서드는 `try` 가 끝나면 자동으로 호출된다.
	// 종료 시점에 자원을 반납하는 방법을 여기에 정의하면 된다.
	public void close()  {
		System.out.println("NetworkClientV5.close");
		disconnect();
		
	}
	public void initError(String error) {
		if(error.contains("error1")) {
			connectError = true;
		}
		else if(error.contains("error2")) { //error2를 포함하는가?
			sendError = true;
		}
		else if(error.contains("error3")) {
			testError = true;
		}
	}
	


}
