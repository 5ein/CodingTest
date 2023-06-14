package Doit;

import java.util.Scanner;

public class 연습1_08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a와 b 값을 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("정수 a, b 사이의 모든 정수의 총합: " + sumof(a, b));
	}
	
	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a < b) {
			min = a; max = b;
		}else {
			min = b; max = a;
		}
		
		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
}
