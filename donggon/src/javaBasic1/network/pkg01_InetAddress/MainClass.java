package javaBasic1.network.pkg01_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Identity;


public class MainClass {
	public static void main(String[] args) {
		//InetAddress클래스 : ip주소를 추상화한클래스
		//도메인을 이용한 InerAddress객체생성
		try {
			InetAddress iAddr = InetAddress.getByName("music.youtube.com");
			System.out.println("호스트주소(IP) : "+iAddr.getHostAddress());
			System.out.println("호스트이름(도메인) : "+iAddr.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println();
		//IP주소를이용한 InetAddress객체생성
		try {
			byte[] ip = {(byte)172, (byte)217, (byte)161, 46};
			InetAddress iAddr2 = InetAddress.getByAddress(ip);
			System.out.println("IP(주소) : "+iAddr2.getHostAddress());
			System.out.println("도메인(이름) : "+iAddr2.getHostName());
			System.out.println(iAddr2);
	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
