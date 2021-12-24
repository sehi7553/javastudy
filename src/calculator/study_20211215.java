package calculator;
import java.util.Scanner;

public class study_20211215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d %% %d = %d\n", x, y, x%y);
		
		sc.close();
	}
}
