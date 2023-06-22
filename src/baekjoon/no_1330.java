package Baekjoon;

import java.util.Scanner;

//두 수 비교하기
public class no_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A == B) {
			System.out.println("==");
		}else if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}
		sc.close();
		
	}

}
