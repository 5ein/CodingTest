package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 의좋은형제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());
		br.close();
		for (int i = 0; i < d; i++) {
			if(i % 2 == 0) {
				int n = 0;
				if(n1 % 2 != 0) {
					n = n1 / 2 + 1;
					n1 -= n;
					n2 += n;
				} else {
					n = n1 / 2;
					n1 -= n;
					n2 += n;
				}
			} else {
				int n = 0;
				if(n2 % 2 != 0) {
					n = n2 / 2 + 1;
					n2 -= n;
					n1 += n;
				} else {
					n = n2 / 2;
					n2 -= n;
					n1 += n;
				}
			}
		}
		
		System.out.println(n1 + " " + n2);
	}
}
