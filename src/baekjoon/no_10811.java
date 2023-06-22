package baekjoon;

import java.util.Scanner;

public class no_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = i + 1; 
		}
		
		for (int a = 0; a < M; a++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			while(i < j) {
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
				i++;
				j--;
			}
		}
		
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
