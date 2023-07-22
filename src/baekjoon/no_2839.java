package baekjoon;

import java.util.Scanner;

public class no_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int count = N/3 + 1;
		
		for (int i = 0; i <= N/3; i++) {
			for (int j = 0; j <= N/5; j++) {
				if(3 * i + 5 * j == N) {
					if(i + j < count) count = i + j;
				}
			}
		}
		
		if(count == (N/3 + 1)) System.out.println(-1);
		else System.out.println(count);
	}

}
