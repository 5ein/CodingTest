package Baekjoon;

import java.util.Scanner;

public class no_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] S = new int[30];
		
		for (int i = 1; i <= 28; i++) {
			int n = sc.nextInt();
			S[n - 1] = n;
		}
		
		for (int i = 0; i < S.length; i++) {
			if(S[i] == 0) System.out.println(i+1);
		}
		
		sc.close();
	}

}
