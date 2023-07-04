package baekjoon;

import java.util.Scanner;

public class no_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] result = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] = A[i][j] + B[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		//배열로 적혀나옴
//		for (int j = 0; j < N; j++) {
//			System.out.println(Arrays.toString(result[j]));
//		}
		
		sc.close();
	}

}
