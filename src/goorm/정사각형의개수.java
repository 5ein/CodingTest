package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 정사각형의개수 {
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long n = Long.parseLong(br.readLine());
//		br.close();
//		long answer = n * (n + 1) * (2 * n + 1) / 6;
//		System.out.println(answer);
//	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();
		long answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += Math.pow(i, 2);
		}
		System.out.println(answer);
	}
}
