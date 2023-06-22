package doit;

import java.util.Scanner;

public class 연습01_09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a와 b 값을 입력하시오.");
		int a = sc.nextInt(); System.out.println("a값: " + a);
		int b = sc.nextInt(); System.out.println("b값: " + b);
		
		if(b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			b = sc.nextInt(); System.out.println("b값: " + b);
		}
		
		System.out.println("b-a 는 " + (b - a) + "입니다.");
		
		sc.close();
	}
	
}
