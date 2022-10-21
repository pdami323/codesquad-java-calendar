package calendar;

import java.util.Scanner;

public class Calendar_prac01 {
	private final static String PROMPT = "cal> ";

	public int getMaxDays(int month) {
		if (month % 2 == 0 && month != 2 && month != 8) {
			return 30;
		} else if (month == 2) {
			return 28;
		} else {
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
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month == -1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			if (month < 1 || month > 12) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			int max_days = cal.getMaxDays(month);
			cal.printMonth(max_days);
		}
		scanner.close();
	}
}
