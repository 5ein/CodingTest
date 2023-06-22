package baekjoon;

import java.util.Scanner;

public class no_10810 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] B = new int[N];
		
		for (int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int b = i - 1; b < j; b++) {
				B[b] = k;
			}
		}
		
		for (int i : B) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
