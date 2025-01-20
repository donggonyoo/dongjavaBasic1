package javaBasic1.exception.ex;

public class NetworkClientV1 {
	private final String address;
	private boolean connectError;
	private boolean sendError;
	
	public NetworkClientV1(String address) {
		this.address = address;
	}

	public void connect()/* throws NetworkExceptionV1 */{ //RuntimeException은 던지지않아도 됨
		if(connectError) {
			//새로운 예외를발생시킴
//			throw new NetworkExceptionV1("connectError  ",address+ "서버에 연결 실패  ");
			throw new RuntimeException("RuntimeException 이 발생했습니다 (코드점검필요)");
			
		}System.out.println(address+"연결 성공");
	}
	
	public void send(String data)throws NetworkExceptionV1 {//NetworkExceptionV1으로던짐
		if(sendError) {
			throw new NetworkExceptionV1("sendError  ",address+ " 서버에 데이터 전송 실패 : "+data);
		}
		System.out.println(address+"데이터 전송 성공 : "+data);
	}
	
	
	public void disconnect() {
		System.out.println(address+" 서버연결해제");
	}
	public void initError(String error) {
		if(error.contains("error1")) { //error1을 포함하는가?
			connectError = true;
		}
		else if(error.contains("error2")) { //error2를 포함하는가?
			sendError = true;
		}
	}
}
