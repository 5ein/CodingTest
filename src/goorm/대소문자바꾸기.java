package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 대소문자바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < n; i++) {
			if(c[i] <= 90) c[i] += 32;
			else c[i] -= 32;
		}
		
		for (char i : c) {
			System.out.print(i);
		}
		
	}
}
