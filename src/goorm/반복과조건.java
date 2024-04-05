package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 반복과조건 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || j == n - 1 - i) arr[i][j] = i + 1;
				else arr[i][j] = 0;
			}
		}

		for (int[] i : arr) {
			for (int j : i) System.out.print(j);
			System.out.println();
		}

	}

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        br.close();
//        
//        int[][] square = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            int start = i;
//            int end = N - 1 - i;
//            for (int j = 0; j < N; j++) {
//                if (j == start || j == end) {
//                    square[i][j] = i + 1;
//                }
//            }
//        }
//        
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(square[i][j]);
//            }
//            System.out.println();
//        }
//    }

}
