package javaBasic1.network.prk04_URLDecoder_Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			
			String s = "HI everyone!!!78((@";
			String encodingM = "UTF-8";
			String encodingM2 = "UTF-88";
			System.out.println("원본 : "+s);
			String encode = URLEncoder.encode(s,encodingM);
			System.out.println("encode : "+encode);
			String decode = URLDecoder.decode(s,encodingM);
			System.out.println("decode : "+decode);
			throw new UnsupportedEncodingException();
			
		} catch (UnsupportedEncodingException e) {
			//잘못된 인코딩이름을지정하거나 하면 예외발생
			System.out.println("getMessage : "+e.getMessage());	
			e.printStackTrace();
		}
	}
}
