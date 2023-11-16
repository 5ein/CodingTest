package programmers;

public class 문자열로변환 {

	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}
	
    public static String solution(int n) {
        String answer = "";
        answer += n;
        return answer;
    }
    
//    public static String solution(int n) {
//    	String answer = "";
//    	answer = String.valueOf(n);
//    	return answer;
//    }
    
//    public static String solution(int n) {
//    	String answer = "";
//    	answer = n + "";
//    	return answer;
//    }
    
//    public static String solution(int n) {
//        String answer = Integer.toString(n);
//        return answer;
//    }
}
