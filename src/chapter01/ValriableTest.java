package chapter01;

public class ValriableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * 변수 선언 및 초기화
		 */
		boolean boy = true;
		int num1 = 10;
		int num2;
		num2 = 20;

		float f = 3.14f;
		double pie = 3.14;

		System.out.println(num1 + " , " + num2); // 초기화가 필요

		System.out.println(num1 + " * " + num2 + "=" + num1 * num2);
		System.out.println("boy"); // 초기화가 필요

		// 상수
		final double PI = 3.14;
		double area = 3*3*PI;
		// pi = 3.141592; - 다시 재할당할 경우 에러

	}

}
