package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 반복문 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i <= N; i++) {
			String s = "";
			for (int j = 0; j < i; j++) {
				s += "*";
			}
			System.out.println(s);
		}
	}
}
