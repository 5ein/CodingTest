package Doit;

import java.util.Scanner;

public class 연습1_10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수 a를 입력하시오.");
		String a = sc.next(); System.out.println("a값: " + a);
		System.out.println("그 수는 " + a.length() +"자리 입니다.");
	}
	
}
