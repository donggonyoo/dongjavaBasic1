package javaBasic1.network.prk04_URLDecoder_Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			
			String s = "HI everyone!안녕";
			String encodingM = "UTF-8";
			System.out.println("원본 : "+s);
			String encode = URLEncoder.encode(s,encodingM);
			System.out.println("암호화(encoding) : "+encode);
			String decode = URLDecoder.decode(s,encodingM);
			System.out.println("복호화(decode) : "+decode);
			
			//일부러 예외만들기
			String encodingM2 = "UTF-888";
			String encode2 = URLEncoder.encode(s,encodingM2);
			
		} catch (UnsupportedEncodingException e) {
			//잘못된 인코딩이름을지정하거나 하면 예외발생
			System.out.println("getMessage : "+e.getMessage());	
			e.printStackTrace();
		}
	}
}
