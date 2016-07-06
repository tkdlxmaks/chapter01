package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();

		int i = 0;
		// Q: 아래 while 반복문을 작성하시오.
		while (i < pow) {
			result *= 2;
			i++;
		}
		// Math.pow(2, pow);
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
	}

}
