package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 엘리스트랙매칭 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		arr = br.readLine().split(" ");
		String h = br.readLine();
		br.close();
		
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(h)) answer++;
		}
		
		System.out.println(answer);
	}
}
