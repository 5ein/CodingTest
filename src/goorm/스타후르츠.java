package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타후르츠 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		br.close();
		
		int answer = n % t == 0? n / t - 1 : n / t;
		answer = answer * c * p;
		
		System.out.println(answer);
	}
	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int T = Integer.parseInt(st.nextToken());
//		int C = Integer.parseInt(st.nextToken());
//		int P = Integer.parseInt(st.nextToken());
//		br.close();
//		
//		int answer = N / T;
//		if(N % T == 0) answer -= 1;
//		answer *= C;
//		answer *= P;
//		
//		System.out.println(answer);
//	}
}
