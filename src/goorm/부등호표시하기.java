package goorm;

import java.util.Scanner;

public class 부등호표시하기 {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		String result = "";
		if(a == b) result += a + "==" + b;
		else if(a < b) result += a + "<" + b;
		else result += a + ">" + b;
		
		if(b == c) result += "==" + c;
		else if(b < c) result += "<" + c;
		else result += ">" + c;
		
		System.out.println(result);
	}
}
