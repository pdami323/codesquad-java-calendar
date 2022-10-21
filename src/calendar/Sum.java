package calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		
		//입력 : 키보드로 두 수의 입력을 받는다.
		System.out.print("두 수를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력 : 화면에 두 수의 합을 출력한다.
//		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.printf("두 수의 합은 %d입니다.\n", a+b);
		System.out.printf("%d와 %d의 합은 %d입니다", a, b, a+b);
		scanner.close();			//사용 후 닫아주기	
	}
}
