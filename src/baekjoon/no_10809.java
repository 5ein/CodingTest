package baekjoon;

import java.util.Scanner;

public class no_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = sc.nextLine();
		
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			
			if(arr[c - 97] == -1) {
				arr[c - 97] = i;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
