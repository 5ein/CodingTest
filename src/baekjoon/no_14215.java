package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no_14215 {

	public static void main(String[] args) {
		// 내가 푼 방법
//		Scanner sc = new Scanner(System.in);
//		int[] t = new int[3];
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			t[i] = sc.nextInt();
//			sum += t[i];
//		}
//		sc.close();
//		
//		Arrays.sort(t);
//		int k = sum - t[2];
//		
//		if(k <= t[2]) t[2] = k - 1;
//		
//		int result = 0;
//		for (int i = 0; i < 3; i++) {
//			result += t[i];
//		}
//		System.out.println(result);
		
		// 다른사람 방법
		Scanner sc = new Scanner(System.in);
		int[] t = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();
		
		Arrays.sort(t);
		
		if(t[0] + t[1] <= t[2]) System.out.println(t[0] + t[1] +(t[0] + t[1] - 1));
		else System.out.println(t[0] + t[1] + t[2]);
	}

}
