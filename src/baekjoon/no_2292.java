package baekjoon;

import java.util.Scanner;

public class no_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 1; //겹 수
		int range = 2; // 범위
		
		if(n == 1) count = 1;
		else {
			while(range <= n) {
				range += (6 * count);
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
