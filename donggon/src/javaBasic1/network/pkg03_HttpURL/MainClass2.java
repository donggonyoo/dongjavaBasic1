package javaBasic1.network.pkg03_HttpURL;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass2 {
	public static void main(String[] args) {
		try {
			String spec = "https://www.gdu.co.kr/images/main/logo.png";
			URL url = new URL(spec);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			BufferedInputStream in = new BufferedInputStream(con.getInputStream());
			File file = new File(spec.substring(spec.lastIndexOf("/") + 1));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
			byte[] b = new byte[1024];
			int readByte = 0;
			while((readByte = in.read(b)) != -1)
			out.write(b, 0, readByte);
			out.close();
			in.close();
			} catch(IOException e) {
			e.printStackTrace();
			}

	}

}
