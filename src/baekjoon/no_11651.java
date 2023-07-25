package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no_11651 {

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

			if(dot_1[1] == dot_2[1])  {
				return dot_1[0] - dot_2[0];
			}
			else {
				return dot_1[1] - dot_2[1];	
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(dot[i][0] + " " + dot[i][1]);
		}
		
		sc.close();

	}

}
