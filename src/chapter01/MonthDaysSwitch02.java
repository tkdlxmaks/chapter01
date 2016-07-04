package chapter01;

public class MonthDaysSwitch02 {

	public static void main(String[] args) {
		int month = 5;
		int days = 0;

		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
	
			break;
		case 2:
			days = 28;
			break;
		case 4:case 6: case 9:case 11:
			days = 30;
			break;
		default:
			System.out.println("날짜를 1월~12월을 입력해주세요.");
			break;
		}
		System.out.println("month : " + month + "\n days : " + days);
	}

}
