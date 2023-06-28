package baekjoon;

import java.util.Scanner;

public class no_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int f;
		int l;
		int result = 1;
		for (int i = 0; i < s.length() / 2; i++) {
			f = s.charAt(i);
			l = s.charAt(s.length() - i - 1);
			
			if(f != l) result  = 0;
		}
		System.out.println(result);
		
		sc.close();
	}

}
