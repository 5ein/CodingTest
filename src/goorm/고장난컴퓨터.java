package goorm;

import java.io.*;
import java.util.*;
public class 고장난컴퓨터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int count = 1;
		
		for (int i = 0; i < n - 1; i++) {
			if((arr[i + 1] - arr[i]) > c) count = 1;
			else count++;
		}
		
		System.out.println(count);
	}
}
