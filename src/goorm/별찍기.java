package goorm;

import java.io.*;

public class 별찍기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i <= N; i++) {
			int x = N - i;
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = N - 1; i >= 1; i--) {
			int x = N - i;
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
