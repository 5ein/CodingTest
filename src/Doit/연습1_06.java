package Doit;

import java.util.Scanner;

public class 연습1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
         System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = 0;            // 합
        int i = 1;

        while (i <= n) {        // i가 n 이하면 반복
            sum += i;           // sum에 i를 더함
            i++;                // i 값을 1 증가(increment)
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("변수 i 의 값은 " + i + "(으)로 됩니다.");
    }
}
