package javaBasic1.exception.ex3;

import javaBasic1.exception.ex3.exception.ConnectExceptionV3;
import javaBasic1.exception.ex3.exception.NetworkExceptionV3;
import javaBasic1.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
	public void sendMessage(String data) throws NetworkExceptionV3{
		String address = "http://.donggon.com";
		
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data); //오류검사
		try {
			client.connect();
			client.send(data);
			client.test();
			
			
		} catch (ConnectExceptionV3| SendExceptionV3 e) {
			System.out.println("연결 또는 전송[오류] 오류 메시지 : "+e.getMessage());
		}
		catch (NetworkExceptionV3 a) {
			System.out.println("네트워크[오류] : "+a.getMessage());
		}catch(RuntimeException e) {
			System.out.println("테스트오류 : "+e.getMessage());
		}
		catch(Exception a) {
			System.out.println("알수없는[오류]"+a.getMessage());
		}
		finally {
			client.disconnect();
		}
	}
}
