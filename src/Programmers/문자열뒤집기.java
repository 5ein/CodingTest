package programmers;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		//1. string 배열 이용
//		String[] s = my_string.split("");
//		for (int i = my_string.length() - 1; i >= 0; i--) {
//			answer +=  s[i];
//		}
		
		//2. char 배열 이용
		char[] c = my_string.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			answer += c[i];
		}
		
		System.out.println(answer);
	}

}
