package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 운동중독플레이어 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int w = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		br.close();
		
		int result = w * (30 + r) / 30;
		
		System.out.println(result);
	}
	
}
