package chapter01;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student me = new Student();
		me.name = "안대혁";
		me.age = 21;
		
		// 사용하는 법
		
		
		System.out.println(me.name + " \n" + me.age + ", 등록여부 : " + me.isEnrolled);
		
		
		
	}

}
