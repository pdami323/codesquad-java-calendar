package calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Hello, Calendar");
		System.out.println(" 일  월  화  수 목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int[] day = new int[12];
		for(int i=1;i<=12;i++) {
			if(i%2 == 0&&i!= 8&&i!=2) {
				day[i-1] = 30;
			}else if(i==2) {
				day[i-1] = 28;
			}else {
				day[i-1] = 31;
			}
		}
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, day[month-1]);
		scanner.close();
	}

}
