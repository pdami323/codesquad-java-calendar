package calendar;

import java.util.Scanner;

public class Calendar_prac01 {
	private final static String PROMPT = "cal> ";

	public int getMaxDays(int year, int month) {
		switch(month) {
		case 2 :
			if(year %4 ==0&& year % 100 !=0) {
				return 29;
			}else {
				return 28;
			}
		case 4 :
			return 30;
		case 6 :
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default : 
			return 31;
		}
	}

	public void printMonth(int max) {
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		for (int i = 1; i <= max; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar_prac01 cal = new Calendar_prac01();
		while (true) {
			System.out.println("�⵵�� �Է��ϼ���.");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			if(year == -1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.println("���� �Է��ϼ���.");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			if (month == -1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			if (month < 1 || month > 12) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			int max_days = cal.getMaxDays(year, month);
			System.out.printf("   << %d�� %d�� >>   \n", year, month);
			cal.printMonth(max_days);
		}
		scanner.close();
	}
}
