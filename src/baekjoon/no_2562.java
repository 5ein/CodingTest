package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] A = new int[9];
		for (int i = 0; i < 9; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int n = 0;
		int count = 0;
		for (int i = 0; i < 9; i++) {
			count++;
			if(A[i] > max) {
				max = A[i];
				n = count;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		
		br.close();
	}

}
