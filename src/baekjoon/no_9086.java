package baekjoon;

import java.util.Scanner;

public class no_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String s = sc.next();
			String[] S = s.split("");
			System.out.println(S[0] + S[S.length - 1]);
		}
		
		sc.close();
	}

}
