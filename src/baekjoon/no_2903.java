package baekjoon;

import java.util.Scanner;

//중앙 이동 알고리즘
public class no_2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 1;
		for (int i = 0; i < N; i++) {
			result *= 2;
		}
		
		result = (result + 1) * (result + 1);
		
		System.out.println(result);
		
		sc.close();
	}

}
