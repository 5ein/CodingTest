package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제_7게임 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		int[] answer = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = 0; j < 7; j += 2) {
				answer[i] += Integer.parseInt(s.charAt(j) + "");
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = 1; j < 7; j += 2) {
				int n = Integer.parseInt(s.charAt(j) + "");
				if(n != 0) answer[i] *= n;
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] %= 10;
			System.out.println(answer[i]);
		}
		
	}
	
}
