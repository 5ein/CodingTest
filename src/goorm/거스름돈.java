package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 거스름돈 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int[] m = {40, 20, 10, 5, 1};
		
		int money = n;
		int count = 0;
		
		for (int i : m) {
			count += money / i;
			money %= i;
		}
		
		System.out.println(count);
	}
	
}
