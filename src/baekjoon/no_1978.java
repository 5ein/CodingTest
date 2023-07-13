package baekjoon;

import java.util.Scanner;

public class no_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a;
		int count = 0;
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			
			if(a == 1) continue; //1이면 소수가 아니기 때문
			
			int x = 0; //약수인지
			for (int j = 2; j < a; j++) 
				if(a % j == 0) x++;
			
			//x가 0이면(약수가 없으면) 소수임
			if(x == 0) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
