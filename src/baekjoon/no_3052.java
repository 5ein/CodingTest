package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			int j = sc.nextInt();
			A[i] = j;
		}
		
		for (int i = 0; i < A.length; i++) {
			A[i] %= 42;
		}
		
		Arrays.sort(A);
		int count = 1;
		
		for (int i = 0; i < A.length - 1; i++) {
			if(A[i] != A[i+1]) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
