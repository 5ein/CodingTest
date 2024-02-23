package programmers;

public class 시저암호 {

	public static void main(String[] args) {
//		String s = "AB";
//		int n = 1;
//		String s = "a B z";
//		int n = 4;
		String s = "AaZz";
		int n = 25;
		
		System.out.println(solution(s, n));
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);;
			if(c == ' ') c = ' ';
			else if(Character.isUpperCase(c)) { //대문자일떄
				c = (char)('A' + (c - 'A' + n) % 26);
			} else { //소문자일때
				c = (char) ('a' + (c - 'a' + n) % 26);
			}
			answer += c;
		}
        return answer;
    }

}
