package baekjoon;

import java.util.Scanner;

public class no_27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int i = sc.nextInt();
		
		String[] SS = S.split("");
		
		System.out.println(SS[i-1]);
		
		sc.close();
	}

}
