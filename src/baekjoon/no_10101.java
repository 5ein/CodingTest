package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10101 {

	//1. Scanner 이용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		if(a + b + c == 180) {
//			if(a == 60 && b == 60) System.out.println("Equilateral");
//			else if(a == b || b == c || a == c) System.out.println("Isosceles");
//			else System.out.println("Scalene");
//		}else System.out.println("Error");
//		
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		if(a + b + c == 180) {
			if(a == 60 && b == 60) System.out.println("Equilateral");
			else if(a == b || b == c || a == c) System.out.println("Isosceles");
			else System.out.println("Scalene");
		}else System.out.println("Error");
		
	}

}