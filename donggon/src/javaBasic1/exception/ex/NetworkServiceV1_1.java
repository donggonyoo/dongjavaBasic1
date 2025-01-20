package javaBasic1.exception.ex;

public class NetworkServiceV1_1 {
	public void sendMessage(String data) throws NetworkExceptionV1{
		String address = "http://www.donggon.com";
		
		NetworkClientV1  client = new NetworkClientV1(address);
		client.initError(data); //오류검사
		
		client.connect();
		client.send(data);
		client.disconnect();
	}
}
