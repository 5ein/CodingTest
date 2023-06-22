package Baekjoon;

import java.util.Scanner;

//오븐 시계
public class no_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int H = A;
		int M = B + C;
		
		if(M >= 60) {
			H = H + (M / 60);
			M = M % 60;
			
			if(H > 24) H = H - 24;
			else if(H == 24) H = 0;
		}
		
		System.out.println(H + " " + M);
		
		sc.close();
		
	}

}
