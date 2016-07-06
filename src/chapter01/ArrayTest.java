package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		/***
		 * 배열
		 */

		// 선언 방법 2가지
		char[] c = { 's', 'k', 'u' }; // 저장공간이 있는 것이 아니다. 아직 생성전..
		// char c[];
		c = new char[3]; // 3개짜리 배열

		/*
		 * c[0] = 'S'; c[1] = 'K'; c[2] = 'U';
		 */

		int[] scores = { 100, 90, 20, 40, 50 };

		System.out.println(scores.length);
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		// 확장 for문
		int sum2 = 0;
		for (int score : scores) {
			// 내부적으로 밑으로 순회 - 즉 outOfMemorry가 나올 확률이 없음
			sum2 += score;
		}
		System.out.println(sum + " , " + sum2);
	}
	// 속도차이는 위에가 더 빠르다. 약 몇 만개차이 부터 
	// 안정성은 밑에가 더 안전하다.

}
