package calendar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar_prac03 {
	/*
	 * date ex : "2018-04-14"
	 * plan
	 */
	private HashMap <Date, String> planMap;
	private static final String SAVE_FILE = "calendar.dat";
	public void registerPlan(String strDate, String plan) throws ParseException {
		
		Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
		System.out.println(date);
		planMap.put(date, plan);
		File f = new File(SAVE_FILE);
		String item = "";
		item += strDate;
		item += ",\"" + plan + "\"\n";
		try {
			FileWriter fw = new FileWriter(f, true);	//string을 바로 쓸 수 있다. (true는 append모드)
			fw.write(item);						
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("일정이 등록되었습니다.");
	}
	public void searchPlan(String strDate) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
		String plan = planMap.get(date);
		System.out.println("1개의 일정이 있습니다.");
		System.out.println(plan);
	}
	public int getWeekday(int year, int month) {
		Calendar_prac01 cal1 = new Calendar_prac01();
		
		int day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for(int i=0;i<month-1;i++) {
			day += cal1.getMaxDays(year, i+1);
		}
		day++;
		return day%7;
	}
	private boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 !=0 || year % 400 ==0)) {
			return true;
		}
		return false;
	}
	private int getWeekday_standard (int year, int month) {
		int syear = 1970;
		int smonth = 1;
		int sday = 1;
		int standardWeekday = 3;	//1970/Jan/1st = Thursday
		int count =0;
		for(int i=syear; i< year;i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		Calendar_prac01 cal1 = new Calendar_prac01();
		for(int i=1;i<=month-1;i++) {
			count += cal1.getMaxDays(year, i);
		}
		count++;
		count += standardWeekday;
		return count%7;
	}
	public void printCalendar(int year, int month) throws ParseException {
		Calendar_prac01 cal1 = new Calendar_prac01();
		Calendar_prac03 cal = new Calendar_prac03();
		int max_day = cal1.getMaxDays(year, month);
		int weekday = cal.getWeekday_standard(year, month);
		
		System.out.printf("%d년 %d월\n", year, month);
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
	public Calendar_prac03() throws ParseException {
		planMap = new HashMap<Date, String>();
		File f = new File(SAVE_FILE);
		if(!f.exists()) {
			System.err.println("no save file");
			return;
		}
		try {
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				String[] words = line.split(",");
				String strdate = words[0];
				String plan = words[1].replaceAll("\"", "");
				Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strdate);
				planMap.put(date, plan);
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("년도를 입력하세요.");
//			System.out.println("YEAR> ");
//			int year = scanner.nextInt();
//			if(year == -1) {
//				System.out.println("실행을 종료합니다.");
//				break;
//			}
//			System.out.println("월을 입력하세요.");
//			System.out.println("MONTH> ");
//			int month = scanner.nextInt();
//			if(month == -1) {
//				System.out.println("실행을 종료합니다.");
//				break;
//			}
//			if(month < 1 || month > 12) {
//				System.out.println("잘못 입력했습니다.");
//				continue;
//			}
//			Calendar_prac03 cal = new Calendar_prac03();
//			cal.printCalendar(year, month);
//		}
//		scanner.close();
//		
//	}
}