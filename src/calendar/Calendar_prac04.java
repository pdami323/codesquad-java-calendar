package calendar;
import java.text.ParseException;
import java.util.Scanner;

public class Calendar_prac04 {
	public void run() throws ParseException {
		System.out.println("+---------------+");
		System.out.println("| 1. ���� ���");
		System.out.println("| 2. ���� �˻�");
		System.out.println("| 3. �޷� ����");
		System.out.println("| h. ���� q. ����");
		System.out.println("+---------------+");
		Scanner scanner = new Scanner(System.in);
		Calendar_prac03 cal = new Calendar_prac03();
		while(true) {
			System.out.println("��� (1, 2, 3, h, q)");
			System.out.print("> ");
			String order = scanner.next();
			if(order.equals("1")) {
				cmdRegister(scanner, cal);
			}else if(order.equals("2")) {
				cmdSearch(scanner, cal);
			}else if(order.equals("3")) {
				cmdCalendar(scanner);
			}else if(order.equals("h")) {
				cmdHelp();
			}else if(order.equals("q")) {
				System.out.println("������ �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
		scanner.close();
	}
	public void cmdRegister(Scanner scanner, Calendar_prac03 cal) throws ParseException {
		System.out.println("[���� ���] ��¥�� �Է��ϼ���.");
		System.out.print("> ");
		String date = scanner.next();
		scanner.nextLine();
		System.out.println("������ �Է��ϼ���.");
		String plan = scanner.nextLine();
		cal.registerPlan(date, plan);
		
	}
	public void cmdSearch(Scanner scanner, Calendar_prac03 cal) throws ParseException {
		System.out.println("[���� �˻�] ��¥�� �Է��ϼ���.");
		System.out.print("> ");
		String date = scanner.next();
		cal.searchPlan(date);
	}
	public void cmdCalendar(Scanner scanner) {
		int year = 2022;
		int month = 10;
		System.out.println("[�޷� ����] �⵵�� �Է��ϼ���.");
		System.out.print("> ");
		year = scanner.nextInt();
		System.out.println("���� �Է��ϼ���.");
		System.out.print("> ");
		month = scanner.nextInt();
		
		Calendar_prac01 cal1 = new Calendar_prac01();
		Calendar_prac03 cal = new Calendar_prac03();
		int max_day = cal1.getMaxDays(year, month);
		int weekday = cal.getWeekday(year, month);
		
		System.out.printf("%d�� %d��\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		for(int i=0;i<weekday;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=max_day;i++) {
			System.out.printf("%3d", i);
			if(i%7 == (7-weekday)) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
	public void cmdHelp() {
		
	}
	public static void main (String[] args) throws ParseException {
		Calendar_prac04 cal = new Calendar_prac04();
		cal.run();
	}
}
