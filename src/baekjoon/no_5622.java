package baekjoon;

import java.util.Scanner;

public class no_5622 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char[] c = sc.next().toCharArray();
//		
//		int[] time = new int[10];
//		int t = 2;
//		for (int i = 0; i < time.length; i++) {
//			time[i] = t;
//			t++;
//		}
//		
//		int[] A = new int[c.length];
//		for (int i = 0; i < c.length; i++) {
//			if(65 <= c[i] && 67 >= c[i]) A[i] = 2;
//			else if(68 <= c[i] && 70 >= c[i]) A[i] = 3;
//			else if(71 <= c[i] && 73 >= c[i]) A[i] = 4;
//			else if(74 <= c[i] && 76 >= c[i]) A[i] = 5;
//			else if(77 <= c[i] && 79 >= c[i]) A[i] = 6;
//			else if(80 <= c[i] && 83 >= c[i]) A[i] = 7;
//			else if(84 <= c[i] && 86 >= c[i]) A[i] = 8;
//			else if(87 <= c[i] && 90 >= c[i]) A[i] = 9;
//		}
//		
//		int result = 0;
//		for (int i = 0; i < A.length; i++) {
//			result += time[A[i] - 1];
//		}
//		System.out.println(result);
//		sc.close();
//	}
	
	//바로 숫자 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		
		int result = 0;
		for (int i = 0; i < c.length; i++) {
			if(65 <= c[i] && 67 >= c[i]) result += 3;
			else if(68 <= c[i] && 70 >= c[i]) result += 4;
			else if(71 <= c[i] && 73 >= c[i]) result += 5;
			else if(74 <= c[i] && 76 >= c[i]) result += 6;
			else if(77 <= c[i] && 79 >= c[i]) result += 7;
			else if(80 <= c[i] && 83 >= c[i]) result += 8;
			else if(84 <= c[i] && 86 >= c[i]) result += 9;
			else if(87 <= c[i] && 90 >= c[i]) result += 10;
		}
		
		System.out.println(result);
		sc.close();
	}
	
}
