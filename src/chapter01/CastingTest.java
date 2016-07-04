package chapter01;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * 암시적 형변환 (implicit casting) 
		 * 4byte -> 8byte
		 */
		int i = 100;
		long l = i;

		System.out.println(l);

		/***
		 * 명시적 형변환 (explicit casting) 8byte -> 4byte
		 */
		long l2 =10000 ;
		int j=  (int) l2; // casting 
		// 앞에 값이 깨질 염려가 있다 (버려질 위험이 있다) 그래도 할거냐. (int)형으로 .
		

	}

}
