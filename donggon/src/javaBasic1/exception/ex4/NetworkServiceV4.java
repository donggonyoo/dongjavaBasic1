package javaBasic1.exception.ex4;

public class NetworkServiceV4 {
	public void sendMessage(String data){
		String address = "http://.donggon.com";

		NetworkClientV4 client = new NetworkClientV4(address);
		client.initError(data); //오류검사
		try {
			client.connect();
			client.send(data);
			client.test();
			}
		finally {
			client.disconnect();
		}

	}}
