package kim.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class scannerFile {
	
	//예외처리 필요
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("txt 경로");
		//utf-8 charset 지정
		Scanner sc = new Scanner(file,"UTF-8");
		
		while(sc.hasNext()) {
			System.out.println(sc.next()); //String 을 계속읽고 출력함
		}
		
	}
}
