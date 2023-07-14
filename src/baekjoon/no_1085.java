package baekjoon;

import java.util.Scanner;

public class no_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = Math.abs(0 - x);
		int b = Math.abs(0 - y);
		int c = Math.abs(w - x);
		int d = Math.abs(h - y);
		
		System.out.println(Math.min(d, Math.min(c, Math.min(a, b))));
		
		sc.close();
	}

}
