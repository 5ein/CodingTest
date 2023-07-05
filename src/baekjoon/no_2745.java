package baekjoon;

import java.util.Scanner;

public class no_2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int B = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			
			if('0' <= c && c <= '9') {
				sum = sum * B + (c - '0');
			} else {
				sum = sum * B + (c - 'A' + 10);
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
