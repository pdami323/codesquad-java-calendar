package calendar;

import java.util.Scanner;

public class Calendar {
	//배열
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		// if문
		int[] day = new int[12];
		for (int i = 1; i <= 12; i++) {
			if (i % 2 == 0 && i != 8 && i != 2) {
				day[i - 1] = 30;
			} else if (i == 2) {
				day[i - 1] = 28;
			} else {
				day[i - 1] = 31;
			}
		}
		// switch문
		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 10:
			return 30;
		case 12:
			return 30;
		default:
			return 31;
		}
//		return day[month-1];
//		return MAX_DAYS[month-1];
	}

	public void printSampleCalendar() {
		System.out.println("Hello, Calendar");
		System.out.println(" 일  월  화  수 목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		String PROMPT = "cal> ";
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
//		System.out.println("달을 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		cal.printSampleCalendar();
//		int month = scanner.nextInt();
//		System.out.printf("%d월은 %d일까지 있습니다.\n", month, day[month-1]);
//		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
		
		//n번 반복
		System.out.println("반복횟수를 입력하세요.");
		System.out.print(PROMPT);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("월을 입력하세요.");
		int[] month = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(PROMPT);
			month[i] = scanner.nextInt();
		}
		Calendar cal = new Calendar();
		for(int i=0;i<n;i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", month[i], cal.getmaxDaysOfMonth(month[i]));
		}
		System.out.println("실행을 마칩니다.\n");
		scanner.close();
	}

}
