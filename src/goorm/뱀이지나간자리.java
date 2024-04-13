package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뱀이지나간자리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		br.close();
		
		for (int i = 1; i <= N; i++) {
			if(i % 2 != 0) {
				for (int j = 1; j <= M; j++) {
					System.out.print("#");
				}
				System.out.println();
			} else if (i % 4 == 2) {
				for (int j = 1; j <= M - 1; j++) {
					System.out.print(".");
				}
				System.out.println("#");
			} else if (i % 4 == 0) {
				System.out.print("#");
				for (int j = 1; j <= M - 1; j++) {
					System.out.print(".");
				}
				System.out.println();
			} //else if
		}//for
	}
}
