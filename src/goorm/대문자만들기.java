package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 대문자만들기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		br.close();
		
//		String answer = S.toUpperCase();
		
		String answer = "";
		String[] arr = S.split("");
		for (int i = 0; i < N; i++) {
			answer += arr[i].toUpperCase();
		}
		
		System.out.println(answer);
	}

}
