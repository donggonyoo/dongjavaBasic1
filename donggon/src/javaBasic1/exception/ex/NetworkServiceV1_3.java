package javaBasic1.exception.ex;

public class NetworkServiceV1_3 {
	public void sendMessage(String data) throws NetworkExceptionV1{
		String address = "http://.donggon.com";
		
		NetworkClientV1  client = new NetworkClientV1(address);
		client.initError(data); //오류검사
		try {
			client.connect();
			client.send(data);
			
			
		} catch (NetworkExceptionV1 e) {
			System.out.println("[오류]코드 : "+e.getErrorCode()+" 오류메시지 : "+e.getMessage());
		
		}catch(RuntimeException e) {
			System.out.println("오류코드 : "+e.getMessage()+"  class : "+e.getClass());
		}
		finally { //항상 try catch문이 끝나면 실행
			client.disconnect();
		}
	}
}
