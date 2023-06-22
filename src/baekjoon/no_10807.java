package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //정수의 개수
		String S = br.readLine(); //스트링으로 정수들 받기
		String[] SS = S.split(" "); // 갈라서 배열에 넣기
		int[] SSS = new int[N];
		for (int i = 0; i < N; i++) {
			SSS[i] = Integer.parseInt(SS[i]);
		}
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			if(SSS[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}

}
