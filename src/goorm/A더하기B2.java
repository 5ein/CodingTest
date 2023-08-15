package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A더하기B2 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		br.close();
		
		String result = String.format("%.6f", a  + b); //소수6번째자리 까지 출력
		
		System.out.println(result);
	}
	
}
