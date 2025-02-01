package javaBasic1.exception.ex4;

public class NetworkService_Auto{
	public void sendMessage(String data) throws Exception{
		String address = "http://.donggon.com";

		//try with resource 사용법
		//try(Resource re = new Resource())
		try( NetworkClient_Auto client= new NetworkClient_Auto(address)) {
			client.initError(data); //오류검사
			client.connect();
			client.send(data);
			client.test();}
		
		catch(Exception e) {
			System.out.println("예외확인 : "+e.getMessage());
			throw e;
		}

	}
}
