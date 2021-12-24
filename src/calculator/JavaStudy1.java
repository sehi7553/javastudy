package calculator;
import java.util.Scanner;

public class JavaStudy1 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);	
		int sum = 0;
		int total = 0;		
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
			for(int i = 1; i <=num; i++){
			sum += 1;
			total += sum;
		}
		System.out.println(total);
	}

}