package baekjoon;

import java.util.Scanner;

public class no_2581 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N + 1];	// 배열 생성 
		get_prime();
		
		int sum = 0; // 소수 합
		int min = Integer.MAX_VALUE; // 소수 최솟값
		
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
	
	// 에라토스테네스 체 알고리즘 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
