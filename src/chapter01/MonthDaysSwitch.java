package chapter01;

public class MonthDaysSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 5;
		int days = 0;

		// switch 에서는 작다 크다 비교를 할 수 없다.
		// 반드시 switch 문은 case 당 break;를 꼭 해줘야한다
		switch (month) {
		case 1: {
			days = 31;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		case 3: {
			days = 31;
			break;
		}
		case 4: {
			days = 30;
			break;
		}
		case 5: {
			days = 31;
			break;
		}
		case 6: {
			days = 30;
			break;
		}
		case 7: {
			days = 31;
			break;
		}
		case 8: {
			days = 31;
			break;
		}
		default:
			days=0;
			break;
		}
		System.out.println("month : "+month+"\n days : "+days);
	}

}
