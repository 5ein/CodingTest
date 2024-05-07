package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class 재원넘버 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		long answer = 0; //long을 사용해야함!
		for (int i = 1; i <= n; i++) {
			answer += Math.pow(3, i); //3의 i승
		}
		System.out.println(answer);
	}
}
