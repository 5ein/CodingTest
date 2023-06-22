package Baekjoon;

import java.util.Scanner;

public class no_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] B = new int[N];
		for (int i = 0; i < B.length; i++) {
			B[i] = i + 1;
		}
		
		for (int a = 0; a < M; a++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			int k = B[i];
			B[i] = B[j];
			B[j] = k;
		}
		
		for (int i : B) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
