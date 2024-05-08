package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 단어의개수세기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i].trim();
			if (s.equals(""))
				continue;
			else
				answer++;
		}
		System.out.println(answer);
	}
}
