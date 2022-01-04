package arry;
import java.util.Scanner;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오름차순으로 정렬해주는 기능");
        System.out.println("랜덤으로 숫자 3개를 입력하세요");
        int num[] = new int[3];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] > num[j]) {
                        int temp = num[j];
                        num[j] = num[i];
                        num[i] = temp;
                } else {
                        break;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
