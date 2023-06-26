package baekjoon;

import java.util.Scanner;

public class no_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			String[] SS = S.split("");
			for (int j = 0; j < SS.length; j++) {
				for (int j2 = 0; j2 < R; j2++) {
					System.out.print(SS[j]);
				}
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
