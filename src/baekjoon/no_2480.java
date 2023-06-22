package Baekjoon;

import java.util.Scanner;

//주사위 세개
public class no_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = 0;
		int max = a;
		
		if(a == b && b == c) {
			sum = 10000 + a * 1000;
		}else if(a == b || b == c || c == a) {
			if(a == b) {
				sum = 1000 + a * 100;
			}else if(b == c) {
				sum = 1000 + b * 100;
			}else if(c == a) {
				sum = 1000 + c * 100;
			}
		}else if(a != b && b != c && c != a) {
			if(b > max) max = b;
			if(c > max) max = c;
			sum = max * 100;
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
