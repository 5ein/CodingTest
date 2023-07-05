package baekjoon;

import java.util.Scanner;

public class no_2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			double C = sc.nextInt();
			q = (int)C / 25;
			C %= 25;
			
			d = (int)C / 10;
			C %= 10;
			
			n = (int)C / 5;
			C %= 5;
			
			p = (int)C / 1;
			
			System.out.println(q + " " + d + " " + n + " " + p);
		}
		
		sc.close();
	}

}
