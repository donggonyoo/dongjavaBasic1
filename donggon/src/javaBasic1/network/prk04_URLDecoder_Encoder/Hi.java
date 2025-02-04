package javaBasic1.network.prk04_URLDecoder_Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Hi {
	public static void main(String[] args) {
		String encoder1 = "UTF-8";
		try {
			String decode = URLDecoder.decode("HI+everyone%21%EC%95%88%EB%85%95", encoder1);
			String decode2 = URLDecoder.decode("HI+everyone%21%EC%95%88", encoder1);
			System.out.println(decode);
			System.out.println(decode2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
