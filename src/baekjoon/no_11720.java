package baekjoon;

import java.util.Scanner;

public class no_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //숫자의 개수N
		
		String s = sc.next();
		String[] S = s.split("");
		
		int[] I = new int[N];
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			I[i] = Integer.parseInt(S[i]);
			
			sum += I[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
