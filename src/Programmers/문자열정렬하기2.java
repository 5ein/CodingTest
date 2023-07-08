package programmers;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		String answer = "";
		
		//방법 1
		char[] C = my_string.toCharArray();
		
		for (int i = 0; i < my_string.length(); i++) {
			if('A' <= C[i] && C[i] <= 'Z') {
				C[i] += 32;
			}
		}
		Arrays.sort(C);
		
		for (char i : C) {
			answer += i;
		}
		
		//방법 2
//		char[] C = my_string.toLowerCase().toCharArray();
//		
//		Arrays.sort(C);
//		
//		for (char i : C) {
//			answer += i;
//		}
		
		System.out.println(answer);
	}

}
