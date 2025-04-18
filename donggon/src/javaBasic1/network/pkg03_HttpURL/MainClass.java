package javaBasic1.network.pkg03_HttpURL;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {
	public static void main(String[] args) {
		try {
		URL url = new URL("https://www.google.com/");
	
		//URLConnection : URL에서 참조하는 리소스를 읽고 쓸 수 있는 클래스
		//HttpURLConnection : HTTP 관련 기능을 지원하는 URLConnection 클래스의 서브 클래스
		HttpURLConnection con = (HttpURLConnection)url.openConnection(); 
		//URLConnection--> HttpURLConnection
		
		System.out.println(con.getResponseCode());//응답코드반환 200:정상 // 404: 페이지x
		System.out.println(con.getRequestMethod());//요청메서드반환
		System.out.println(con.getRequestProperty("User-Agent"));//해당key를가진 속성반환
		
		
		con.disconnect();//연결닫기
		} catch(IOException e) {
			//파일을 열거나 읽거나 쓸 때, 네트워크와의 통신 시, 
			//입출력 작업을 수행하는 도중에 오류가 발생하는 경우 등에 발생
		e.printStackTrace();
		}
		}


}
