package programmers;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age = 23;
		String answer = "";
		
		String[] s = Integer.toString(age).split("");
		
		for (int i = 0; i < s.length; i++) {
			answer += (char)(Integer.parseInt(s[i]) + 97);
		}
		
		System.out.println(answer);
	}

}
