package kim.scanner;

import java.util.Scanner;

public class scannerString {
	public static void main(String[] args) {
		
		String stringInput ="123 abc2 def";
		Scanner sc = new Scanner(stringInput);
		
		//정수만 입력받음
		int a = sc.nextInt();
		//문자열 입력받음
		String b = sc.next();
		
		//hasNext() 읽어올 입력값이 남아있는지 체크함
		boolean tf = sc.hasNext();
		System.out.println("입력값이 있는가 ?"+tf);
		String c = null;
		if(tf) {
			c=sc.next();
		}
		System.out.println("첫번째"+a);
		System.out.println("두번째"+b);
		System.out.println("세번째"+c);
		
		boolean tf2 = sc.hasNext();
		System.out.println("입력값이 또 있는가? "+tf2);
		
	}
}
