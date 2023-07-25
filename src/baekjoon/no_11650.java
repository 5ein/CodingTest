package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no_11650 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dot = new int[n][2];
		for (int i = 0; i < n; i++) {
			dot[i][0] = sc.nextInt();
			dot[i][1] = sc.nextInt();
		}
		
		//람다식 이용
		Arrays.sort(dot, (dot_1, dot_2) -> {

			if(dot_1[0] == dot_2[0])  {
				return dot_1[1] - dot_2[1];
			}
			else {
				return dot_1[0] - dot_2[0];	
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(dot[i][0] + " " + dot[i][1]);
		}
		
		sc.close();
	}
	
	//시간 초과 뜸
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] dot = new int[n][2];
//		for (int i = 0; i < n; i++) {
//			dot[i][0] = sc.nextInt();
//			dot[i][1] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < dot.length; i++) {
//			int k = 0, x, y;
//			for (int j = 0; j < dot.length; j++) {
//				if(dot[i][0] > dot[j][0]) k++;
//				else if(dot[i][0] == dot[j][0]) {
//					if(dot[i][1] > dot[j][1]) k++;
//				}
//			}
//			
//			x = dot[k][0];
//			y = dot[k][1];
//			
//			dot[k][0] = dot[i][0];
//			dot[i][0] = x;
//			dot[k][1] = dot[i][1];
//			dot[i][1] = y;
//		}
//		
//		for (int i = 0; i < dot.length; i++) {
//			System.out.println(dot[i][0] + " " + dot[i][1]);
//		}
//		
//		sc.close();
//	}
}
