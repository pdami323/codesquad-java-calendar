package calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		
		//�Է� : Ű����� �� ���� �Է��� �޴´�.
		System.out.print("�� ���� �Է����ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//��� : ȭ�鿡 �� ���� ���� ����Ѵ�.
//		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.printf("�� ���� ���� %d�Դϴ�.\n", a+b);
		System.out.printf("%d�� %d�� ���� %d�Դϴ�", a, b, a+b);
		scanner.close();			//��� �� �ݾ��ֱ�	
	}
}
