package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		if (n1 > n2) {
			System.out.println("n1 값은 " + n1 + "그대로 출력");

		} else {
			int temp = n1;
			n1 = n2;
			n2 = temp;
			System.out.println("n1 값은 " + n1 + "변경후 출력");
			System.out.println("n2 값은 " + n2 + "변경후 출력");

		}

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 50;
		int a2 = 50;
		int a3 = 51;

		/*if (a1 > a2) {
			if (a1 > a3) {
				System.out.println("a1가 " + a1 + "으로 제일 큼");
			} else {
				System.out.println("a3가 " + a3 + "으로 제일 큼");
			}
		} else if (a2 > a3) {
			System.out.println("a2가 " + a2 + "으로 제일 큼");

		} else if (a3 > a2) {
			System.out.println("a3가 " + a3 + "으로 제일 큼");
		} else {
			System.out.println("모든 값이 같은가 보지");
		}*/

		if (a1 > a2 && a1 > a3) {
			// a1가 maxium
			System.out.println("a1가 " + a1 + "으로 제일 큼");
		} else if (a2 > a3) {
			// a2가 maxium
			System.out.println("a2가 " + a2 + "으로 제일 큼");
		} else if (a3 > a1) {
			// a3가 maxium
			System.out.println("a3가 " + a3 + "으로 제일 큼");
		} else {
			System.out.println("값이 같은가벼");
		}
	}

}
