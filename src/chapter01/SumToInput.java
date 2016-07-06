package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {

		System.out.print("입력 > ");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1 to " + n + " : " + sum);
		
		scanner.close(); // warming을 없애기위한.
	}

}
