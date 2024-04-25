package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 구름아이돌 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			int m = Integer.parseInt(st.nextToken());
			map.put(m, i);
			arr[i - 1] = m;
		}
		Arrays.sort(arr);
		
		String answer = "";
		for (int i = n - 1; i > n - 4; i--) {
			answer += map.get(arr[i]) + " ";
 		}
		
		System.out.println(answer);
	}
}
