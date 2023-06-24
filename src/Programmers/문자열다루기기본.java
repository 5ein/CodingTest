package programmers;

public class 문자열다루기기본 {
	public static void main(String[] args) {
		boolean answer = true;
		String s = "1234";
		int size = s.length();
		
		if(size == 4 || size == 6) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				answer = false;
			}
		}else answer = false;
		
		System.out.println(answer);
	}
}
