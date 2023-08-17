package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 프로젝트매니징 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int t = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			m += Integer.parseInt(br.readLine());
		}
		br.close();
		
		t += m / 60;
		t %= 24;
		m %= 60;
		
		System.out.println(t + " " + m);
	}

}
