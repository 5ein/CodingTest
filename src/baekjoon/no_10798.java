package baekjoon;

import java.util.Scanner;

public class no_10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] c = new char[5][15];
		
		for (int i = 0; i < 5; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				c[i][j] = s.charAt(j);
			}
		}
		
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (c[i][j] != '\0') {
                    System.out.print(c[i][j]);
                }
            }
        }
		
		sc.close();
	}

}
