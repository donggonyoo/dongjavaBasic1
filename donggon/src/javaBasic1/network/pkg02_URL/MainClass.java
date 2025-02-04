package javaBasic1.network.pkg02_URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {
	public static void main(String[] args)  {
		//URL클래스 : URL 처리를 위한 클래스
		//접속 주소(가상)
		String a = "protocol://host:port/path?query#reference";
		String spec = "https://music.youtube.com/search?q=%EB%B0%9C%EB%9D%BC%EB%93%9C+%EB%AA%A8%EC%9D%8C";
		
		try {
			URL url = new URL(spec);
			System.out.println("getProtocol : "+url.getProtocol());
			System.out.println("getDefaultPort : "+url.getDefaultPort());//기본포트번호
			System.out.println("getHost : "+url.getHost());
			System.out.println("getPort : "+url.getPort());
			System.out.println("getPath : "+url.getPath());
			System.out.println("getQuery : "+url.getQuery());
			System.out.println("getFile :"+url.getFile());//path+query
			System.out.println("getRef : "+url.getRef());
			
			
			//MalformedURLException : 주소 잘못 입력시 오류
			
		} catch (MalformedURLException e) {
			e.printStackTrace(); //오류문출력
			System.out.println("잘못된 주소에요");
			
			
		}
		

	}

}
