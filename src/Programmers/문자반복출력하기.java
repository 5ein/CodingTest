package programmers;

public class 문자반복출력하기 {
	
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer = "";
		
		//1. char이용
//		for (int i = 0; i < my_string.length(); i++) {
//			char c = my_string.charAt(i);
//			
//			for (int j = 0; j < n; j++) {
//				answer += c;
//			}
//		}
		
		//2. string배열 이용
		String[] s = my_string.split("");
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				answer += s[i];
			}
		}
		
		System.out.println(answer);
	}
}
