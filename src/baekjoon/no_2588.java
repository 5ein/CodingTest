package baekjoon;

import java.util.Scanner;

public class no_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String C = Integer.toString(B);
		String[] S = C.split("");
		
		int D = Integer.parseInt(S[2]);
		int E = Integer.parseInt(S[1]);
		int F = Integer.parseInt(S[0]);
		
		System.out.println(A * D);
		System.out.println(A * E);
		System.out.println(A * F);
		System.out.println(A * B);
		
		sc.close();
	}

}
