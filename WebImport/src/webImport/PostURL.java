package webImport;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class PostURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.kopo.ac.kr/kangseo/index.do");
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			Scanner scan = new Scanner(is);
			int line = 1;
			while(scan.hasNext()) {
				String str = scan.nextLine();
				System.out.println((line++)+":"+str);
			}
			scan.close();
		} catch (MalformedURLException e) {
			System.out.println();
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println();
			e.printStackTrace();
		}
	}
	
}
