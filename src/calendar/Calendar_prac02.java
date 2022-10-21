package calendar;
import java.util.Scanner;

public class Calendar_prac02 {
	public void printMonth(String first, int max) {
		String[] weekday = {"SU", "MO","TU", "WE", "TH", "FR", "SA"};
		int n = 7;
		for(int i=0;i<7;i++) {
			System.out.printf("%3s",weekday[i]);
			if(first.equals(weekday[i])) {
				n = i;
			}
		}
		System.out.println("\n---------------------");
		for(int i=0;i<n;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=max;i++) {
			System.out.printf("%3d", i);
			if(i%7 ==(7-n)) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
	}
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("�⵵�� �Է��ϼ���.(exit: -1)");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			if(year == -1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.println("���� �Է��ϼ���.(exit: -1)");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			if(month == -1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			if(month < 1 || month > 12) {
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
			System.out.println("ù��° ������ �Է��ϼ���. (SU, MO, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			String weekday = scanner.next();
			Calendar_prac01 cal1 = new Calendar_prac01();
			int max_day = cal1.getMaxDays(year, month);
			Calendar_prac02 cal = new Calendar_prac02();
			System.out.printf("   << %d�� %d�� >>   \n", year, month);
			cal.printMonth(weekday, max_day);
		}
		scanner.close();
	}
}
