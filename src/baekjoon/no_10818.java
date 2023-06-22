package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine()); 
			//위에서 이미 한줄읽어서 다음줄 읽을때 한번더 선언해줘야하나봐! 
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = A[0];
		int max = A[0];
		for (int i = 0; i < A.length; i++) {
			if(A[i] < min) min = A[i];
			if(A[i] > max) max = A[i];
		}
		
		System.out.println(min + " " + max);
		
		br.close();
	}
}
