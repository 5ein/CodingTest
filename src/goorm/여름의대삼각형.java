package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 여름의대삼각형 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		for (int i = 0; i < x.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		//신발끈 공식 이용!
		double answer = (x[0] * y[1] + x[1] * y[2] + x[2] * y[0]) - (x[1] * y[0] + x[2] * y[1] + x[0] * y[2]);
		answer = Math.abs(answer) * 0.5;
		
		System.out.println(String.format("%.2f", answer));
	}
}
