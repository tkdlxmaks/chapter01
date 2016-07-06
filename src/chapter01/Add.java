package chapter01;

public class Add {

	public static void main(String[] args) {

		int total = 0;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			total += value;
		}
		// 여기서 total += Integer.parseInt(arg); 는 되지 않더라.
		System.out.println(total);
	}

}
