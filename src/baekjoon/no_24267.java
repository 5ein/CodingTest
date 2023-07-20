package baekjoon;

import java.util.Scanner;

public class no_24267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		//nCr = n! / ((n-r)! * r!)
		//7C3
		
		System.out.println(n * (n-1) * (n-2) / 6);
		System.out.println(3);
		
	}

}