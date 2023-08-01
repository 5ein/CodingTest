package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class no_11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		HashSet<String> set	= new HashSet<>(); //set사용하면 중복 제거 가능
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				set.add(s.substring(i, j));
			}
		}
		
		System.out.println(set.size());
	}

}
