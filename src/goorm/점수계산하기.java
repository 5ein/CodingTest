package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 점수계산하기 {
/*
입력
10
OOXOOOXXOO

출력
12
*/
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		br.close();
		int num = 0;
		int answer = 0;
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if(c == 'O') {
				num++;
				answer += num;
			} else num = 0;
			
		}
		System.out.println(answer);
	}

}
