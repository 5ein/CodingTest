package programmers;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(solution(s));
	}
	
//    public static String solution(String s) {
//        String answer = "";
//        int length = s.length();
//        if (length % 2 == 0) {
//			answer += s.charAt(length / 2 - 1);
//			answer += s.charAt(length / 2);
//		} else {
//			answer += s.charAt(length / 2);
//		}
//        return answer;
//    }
    
    public static String solution(String s) {
    	String answer = "";
    	int length = s.length();
    	if (length % 2 == 0) {
    		answer = s.substring(length / 2 - 1, length / 2);
    	} else {
    		answer  = s.substring(length / 2, length / 2 + 1);;
    	}
    	return answer;
    }

}
