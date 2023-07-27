package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class no_18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			arr[i] = arr2[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr2);
		
		int rank = 0;
		for (int i : arr2) {
			if (!map.containsKey(i)) {
				map.put(i, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			int r = map.get(i);
			sb.append(r).append(" ");
		}
		System.out.println(sb);
		
	}

}
