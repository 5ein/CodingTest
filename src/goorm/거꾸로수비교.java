package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 거꾸로수비교 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] arr = new String[2];
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < 2; i++) {
			String s = st.nextToken();
			arr[i] = s;
			String s2 = "";
			for (int j = s.length() - 1; j >= 0 ; j--) {
				s2 += s.charAt(j);
			}
			arr2[i] = Integer.parseInt(s2);
		}
		
		String answer = "";
		answer = arr2[0] > arr2[1] ? arr[0] : arr[1];
		
		System.out.println(answer);
	}
}
