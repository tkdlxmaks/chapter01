package chapter01;

import java.util.Date;

public class MonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 5;
		int days = 0;
		
		
		// 가시성 부족
		if (month == 1) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 3) {
			days = 31;
		} else if (month == 4) {
			days = 30;
		} else if (month == 5) {
			days = 31;
		} else if (month == 6) {
			days = 30;
		} else if (month == 7) {
			days = 31;
		} else if (month == 8) {
			days = 31;
		} else if (month == 9) {
			days = 30;
		} else if (month == 10) {
			days = 31;
		} else if (month == 11) {
			days = 30;
		} else if (month == 12) {
			days = 31;
		} else {
			days = 0;
		}
		
		System.out.println("month : "+month+"\n days : "+days);
	}

}
