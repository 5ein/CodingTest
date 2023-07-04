package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class no_2566 {
	//BufferedReader 와 StringTokenizer 이용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] A = new int[9][9];
		
		int max = 0;
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < A.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if(A[i][j] >= max) {
					max = A[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
		
		br.close();
	}
	
	//Scanner 이용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int[][] A = new int[9][9];
//		
//		int max = 0;
//		int x = 0;
//		int y = 0;
//		
//		for (int i = 0; i < A.length; i++) {
//		    for (int j = 0; j < A[i].length; j++) {
//		        A[i][j] = sc.nextInt();
//		        if (A[i][j] >= max) {
//		            max = A[i][j];
//		            x = i + 1;
//		            y = j + 1;
//		        }
//		    }
//		}
//		
//		System.out.println(max);
//		System.out.println(x + " " + y);
//		
//		sc.close();
//	}

}
