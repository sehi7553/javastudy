import java.util.Scanner;

public class java_20211215_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요(+,-,*,/) : ");
		String operator = sc.next();
		System.out.print("숫자 두개를 입력하세요 : "); 
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Calculator calc = new Calculatormpl();
		if(operator.equals("+")) {
			System.out.printf("%d + %d = %d", x, y, calc.plus(x,y));
		}
		else if(operator.equals("-")) {
			System.out.printf("%d - %d = %d", x, y, calc.minus(x,y));
		}
		else if(operator.equals("*")) {
			System.out.printf("%d x %d = %d", x, y, calc.multiplication(x,y));
		}
		else if(operator.equals("/")) {
			System.out.printf("%d ÷ %d = %d", x, y, calc.division(x,y));
		}
	}
}
