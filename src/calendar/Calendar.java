package calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Hello, Calendar");
		System.out.println(" ��  ��  ȭ  �� ��  ��  ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		int[] day = new int[12];
		for(int i=1;i<=12;i++) {
			if(i%2 == 0&&i!= 8) {
				day[i-1] = 30;
			}else {
				day[i-1] = 31;
			}
		}
		System.out.println("���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, day[month-1]);
		scanner.close();
	}

}
