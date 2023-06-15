package baekjoon;

import java.util.Scanner;

//A + B - 3
public class no_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
		
	}
}
