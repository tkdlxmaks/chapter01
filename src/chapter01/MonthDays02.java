package chapter01;

public class MonthDays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 12;
		int days = 0;

		// --> else와 else if 자리가 바뀌면 되지 않는다.
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month > 12 || month == 0) {
			System.out.println("1월부터 12월까지 입력해주세요");
		} else {
			days = 30;
		}
		System.out.println("month : " + month + "\n days : " + days);
	}

}
