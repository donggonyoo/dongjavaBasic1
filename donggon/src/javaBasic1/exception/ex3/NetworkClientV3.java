package javaBasic1.exception.ex3;


import javaBasic1.exception.ex3.exception.ConnectExceptionV3;
import javaBasic1.exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
	private final String address;
	private boolean connectError;
	private boolean sendError;
	private boolean testError;

	public NetworkClientV3(String address) {
		this.address = address;
	}
	public void connect() throws ConnectExceptionV3 {
		if(connectError) {
			throw new ConnectExceptionV3("connectError  ", address+ "서버에 연결 실패  ");
		}System.out.println(address+" 연결 성공");
	}

	public void send(String data)throws SendExceptionV3 {
		if(sendError) {
			throw new SendExceptionV3("sendError  ",address+ " 서버에 데이터 전송 실패 : "+data);
			//			throw new RuntimeException();
		}
		System.out.println(address+"데이터 전송 성공 : "+data);
	}
	public void test(){ //RuntimeException은 던지지않아도 됨
		if(testError) {
			throw new RuntimeException(address+" 서버 버그발생(RuntimeException)");//RunTimeException 생성
			//throw new 예외(message);
		}
		System.out.println(address+" : RunTime 테스트정상");
	}

	public void disconnect() {
		System.out.println(address+" 서버연결해제");
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
		}}
}
