package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 타일장식물 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		long[] arr =  new long[n + 2];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 0; i <= n - 2; i++) {
			arr[i + 2] = arr[i] + arr[i + 1];
		}
		long answer = 4 * arr[n] + 2 * arr[n - 1];
		System.out.println(answer);
	}
}
