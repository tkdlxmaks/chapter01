package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {

		// String s = "HelloWorld";
		// == String s = new String("HelloWorld");
		// 자동 import : ctrl+ Shift + o
		Scanner scanner = new Scanner(System.in);

		// nextLine은 한줄 입력이 될때까지
		// 객체를 사용할땐 메소드를 사용
		int count = scanner.nextInt();
		
		while(count>0) {
			System.out.println(count + ": HelloWorld");	
			count--;
		}
		

	}

}
