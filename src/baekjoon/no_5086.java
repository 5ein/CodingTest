package baekjoon;

import java.util.Scanner;

public class no_5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. do-while 이용
//		int f;
//		int s;
//
//		do {
//			f = sc.nextInt();
//			s = sc.nextInt();
//			
//			if(f == 0 && s == 0) break;
//			
//			if(s % f == 0) System.out.println("factor");
//			else if(f % s == 0) System.out.println("multiple");
//			else System.out.println("neither");
//			
//		} while (f != 0 && s != 0);
		
		//2. while 사용
		while (true) {
			int f = sc.nextInt();
			int s = sc.nextInt();
			
			if(f == 0 && s == 0) break;
			
			if(s % f == 0) System.out.println("factor");
			else if(f % s == 0) System.out.println("multiple");
			else System.out.println("neither");
		}
		
		sc.close();
	}

}
