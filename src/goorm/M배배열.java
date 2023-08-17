package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M배배열 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a.length; i++) {
			int ai = Integer.parseInt(st.nextToken());
			
			if(ai % m == 0) a[i] = ai;
			else a[i] = ai * m;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i : a) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}

}
