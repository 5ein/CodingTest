package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];

		sc.nextLine(); //개행 버림
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String a1, String a2) {
				if (a1.length() == a2.length()) {
					return a1.compareTo(a2);
				} else {
					return a1.length() - a2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		
		for (int i = 1; i < n; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1]))
				System.out.println(arr[i]);
		}
		
	}
}
