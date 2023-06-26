package baekjoon;

import java.util.Scanner;

public class no_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] A = sc.next().split("");
		String[] B = sc.next().split("");
		
		String AA = "";
		String BB = "";
		for (int i = 0; i < A.length; i++) {
			AA += A[A.length - i - 1];
		}
		for (int i = 0; i < B.length; i++) {
			BB += B[B.length - i - 1];
		}
		int a = Integer.parseInt(AA);
		int b = Integer.parseInt(BB);
		
		if(a > b)System.out.println(a);
		else if(a < b) System.out.println(b);
		
		//System.out.println(a>b?a:b);
		
		sc.close();
	}

}
