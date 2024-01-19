package programmers;

import java.util.Scanner;

public class PCCE기출문제2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        //int b_square = c * c - a * a;
        int b_square = (int)(Math.pow(c, 2) - Math.pow(a, 2));

        System.out.println(b_square);
	}

}
