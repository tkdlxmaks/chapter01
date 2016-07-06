package chapter01;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] array1 = { 100, 200, 300, 400 };
		int[] array2 = { 100, 200, 300, 700 };

		boolean result = equals(array1, array2);

		System.out.println(result);
	}

	// static 함수는 static 만 불러 쓸수 있다.
	public static boolean equals(int[] array1, int[] array2) {

		// null check
		if (array1 == null || array2 == null) {
			return false;
		}
		// array1 : array2  비교
		
		if(array1.length != array2.length ) {
			return false;
		} 
		// 여기서 확장 for문을 쓸수 없다. 하나의 공간에서 모든걸 출력할 때 쓰임
		
		for(int i=0; i< array1.length; i++) {
			if(array1[i] != array2[i] ) {
				return false;
			}
		}

		return true;
	}

}
