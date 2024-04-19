package goorm;

import java.io.*;
import java.util.*;
public class 숫자제거정렬 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		br.close();
		int[] arr = new int[set.size()];
		int idx = 0;
		for (Integer i : set) {
			arr[idx] = i;
			idx++;
		}
		Arrays.sort(arr);
		String answer = "";
		for (int i : arr) {
			answer += i + " ";
		}
		System.out.println(answer);
	}
	
	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		ArrayList<Integer> list = new ArrayList<>();
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < N; i++) {
//			int n = Integer.parseInt(st.nextToken());
//			if(!list.contains(n)) list.add(n);
//		}
//		br.close();
//		int[] arr = new int[list.size()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = list.get(i);
//		}
//		Arrays.sort(arr);
//		String answer = "";
//		for (int i : arr) {
//			answer += i + " ";
//		}
//		System.out.println(answer);
//	}
}
