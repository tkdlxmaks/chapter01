package chapter01;

import java.util.Scanner;

/*******************************************************************************
 * Q: 키보드에서 입력을 받은 숫자가 소수(Prime number)인지 아닌지를 판단하려고 합니다. 2부터 시작해서 자신보다 작은 숫자까지
 * 나누어 나머지 값이 0이 나오지 않을 때 소수라고 결론을 내리려고 합니다. 입력받는 숫자는 양의 정수라고 가정하고 빈 부분을 작성하세요.
 ********************************************************************************/
public class PrimeDetect {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		// 2, 3, 5, 7, 11, 13
		while (divisor < num) {

			if (num % divisor == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
			divisor++;
		}

		if (isPrime == true) {
			System.out.println(num + "은 소수가 맞습니다.");

		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}

	}

}
