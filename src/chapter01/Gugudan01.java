package chapter01;

/*******************************************************************************
 * Q: for문 두개를 사용하여 (중첩 for문) 구구단을 출력하는 예제입니다. 코드를 완성해 보세요.
 *******************************************************************************/

public class Gugudan01 {

	public static void main(String[] args) {

		/***
		 * 이중 for문
		 */
		/*
		 * for (int i = 2; i <= 9; i++) { System.out.println(); for (int j = 1;
		 * j <= 9; j++) { System.out.println(i + "*" + j + " = " + i * j); } }
		 */

		/***
		 * 이중 while문
		 */
		int i = 2;

		while (i <= 9) {

			int j = 1;
			while (j <= 9) {
				int result = i * j; // 변수의 생명주기 알아둘것 j<=9의 조건문의 while문을 빠져나오면
									// reuslt는 사라진다.
				System.out.println(i + " * " + j + " = " + result);
				j++;
			}
			System.out.println("=============================");
			i = i + 1; // 쉽게 쓰는게 보기 좋다.

		}
	}

}
