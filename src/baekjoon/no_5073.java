package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no_5073 {

	public static void main(String[] args) {
		//1. max
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//			
//			if(a == 0 && b  == 0 && c == 0) break;
//
//			int max = a;
//			if(max < b) max = b;
//			if(max < c) max = c;
//			
//			int k = a + b + c - max;
//			
//			if(k > max) {
//				if(a == b && b == c)System.out.println("Equilateral");
//				else if(a == b || b == c || c == a) System.out.println("Isosceles");
//				else System.out.println("Scalene");
//			}else System.out.println("Invalid");
//		}
//		sc.close();
		
		//2. Arrays 사용
		Scanner sc = new Scanner(System.in);
		while (true) {
			int[] arr = new int[3];
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			
			Arrays.sort(arr);
			
			int k = sum - arr[2];
			
			if(k > arr[2]) {
				if(arr[0] == arr[1] && arr[1] == arr[2])System.out.println("Equilateral");
				else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) System.out.println("Isosceles");
				else System.out.println("Scalene");
			}else System.out.println("Invalid");
		}
		sc.close();
	}

}
