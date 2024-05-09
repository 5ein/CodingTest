package goorm;

import java.io.*;

public class 막대기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrH = new int[n - 1];
		for (int i = 0; i < arrH.length; i++) {
			arrH[i] = Integer.parseInt(br.readLine());
		}
		int lastH = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 1;
		int h = lastH;
		for (int i = arrH.length - 1; i >= 0; i--) {
			if(arrH[i] > h) {
				count++;
				h = arrH[i];
			}
		}
		
		System.out.println(count);
	}
}
