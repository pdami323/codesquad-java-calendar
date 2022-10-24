package calendar;

import java.util.Scanner;

public class Calendar {
	//�迭
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		// if��
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
		// switch��
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
		System.out.println(" �� �� ȭ �� �� �� ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		String PROMPT = "cal> ";
		Calendar cal = new Calendar();
		cal.printSampleCalendar();
		// ���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
//		System.out.println("���� �Է��ϼ���.");
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		cal.printSampleCalendar();
//		int month = scanner.nextInt();
//		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, day[month-1]);
//		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, cal.getmaxDaysOfMonth(month));
		
		//n�� �ݺ�
//		System.out.println("�ݺ�Ƚ���� �Է��ϼ���.");
//		System.out.print(PROMPT);
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		
//		System.out.println("���� �Է��ϼ���.");
//		int[] month = new int[n];
//		for(int i=0;i<n;i++) {
//			System.out.print(PROMPT);
//			month[i] = scanner.nextInt();
//		}
//		Calendar cal = new Calendar();
//		for(int i=0;i<n;i++) {
//			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month[i], cal.getmaxDaysOfMonth(month[i]));
//		}
//		System.out.println("������ ��Ĩ�ϴ�.\n");
		
		//���ѹݺ�
//		int month = 1;
//		Scanner scanner = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		while(true) {
//			System.out.println("���� �Է��ϼ���.");
//			System.out.print(PROMPT);
//			month = scanner.nextInt();
//			if(month == -1) {
//				System.out.println("��������");
//				break;
//			}
//			if(month <1 || month >12) {
//				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
//				continue;
//			}
//			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, cal.getmaxDaysOfMonth(month));
//		}
		//scanner.close();
	}

}
