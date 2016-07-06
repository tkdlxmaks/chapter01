package chapter01;

public class Echo {

	/***
	 * 기존에 String[] args에 값을 미리 주어지는 경우 
	 * Run As - Run Configuration - Arguments 로 이동 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(args.length); // 무슨 객체로 출력

		for (String arg : args) {
			System.out.println(arg);
		}

		// 표시시 배열에서 참조하는 객체를 화살표로
		args[0] = new String("helo");
		args[1] = new String("World");
		
		for (String arg : args) {
			System.out.println(arg);
		}

	}

}
