package javaBasic1.network.pkg02_URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {
	public static void main(String[] args)  {
		//URL클래스 : URL 처리를 위한 클래스
		//접속 주소(가상)
		String spec = "https://www.example.com:9090/board/view.html?no=1&week=mon#footnote";
		String a = "protocol://host:port/path?query#reference";
		
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
