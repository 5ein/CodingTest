package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 인공지능청소기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			//총 이동거리
			int sum = Math.abs(x) + Math.abs(y);
			
			// 총 이동거리가 n보다 작거나 같고, 총 이동거리 - n의 차이가 짝수면 YES
			if(sum <= n && (sum - n) % 2 == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
