package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동명이인 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String S = st.nextToken();
		
		String[] arr = new String[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		int answer = 0;
		for (String s : arr) {
			if(s.contains(S)) answer++;
		}
		
		System.out.println(answer);
	}
}
