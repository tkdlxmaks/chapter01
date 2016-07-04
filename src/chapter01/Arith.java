package chapter01;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(String.format("%.2f", (float) a / b));
		System.out.println(-a);
		System.out.println(a++);
		System.out.println(a);
		// String.format << 소수 어느 점까지 나타내는

		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(b--);

		System.out.println(10 / 3);
		System.out.println(10. / 3);

		System.out.println(-7 % 3);

	}

}
