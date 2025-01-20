package javaBasic1.exception.ex3;

import javaBasic1.exception.ex3.exception.ConnectExceptionV3;
import javaBasic1.exception.ex3.exception.NetworkExceptionV3;
import javaBasic1.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
	public void sendMessage(String data) throws NetworkExceptionV3{
		String address = "http://.donggon.com";
		
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data); //오류검사
		try {
			client.connect();
			client.send(data);
			client.test();
			
		} catch (ConnectExceptionV3 e) {
			System.out.println("연결[오류] 주소 : "+e.getAddress()+" 오류 메시지 : "+e.getMessage());
		}
		catch (SendExceptionV3 a) {
			System.out.println("전송[오류] 전송데이터 : "+a.getDate()+" 오류 메시지 : "+a.getMessage());
		}catch(RuntimeException e){
			System.out.println("Test오류 : "+e.getMessage());
		}
		finally {
			client.disconnect();
		}
	}
}
