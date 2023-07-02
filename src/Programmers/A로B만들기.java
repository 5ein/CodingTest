package programmers;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
		
		//char 배열로 풀기
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		Arrays.sort(b);
		Arrays.sort(a);
		if(Arrays.equals(a, b)) answer = 1;
		
		//2. String 배열로 풀기
//		String[] b = before.split("");
//		String[] a = after.split("");
//		Arrays.sort(b);
//		Arrays.sort(a);
//		if(Arrays.equals(a, b)) answer = 1;
		
		System.out.println(answer);
		
	}

}
