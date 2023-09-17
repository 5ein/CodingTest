package programmers;

public class 문자열뒤집기2 {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		System.out.println(solution(my_string, s, e));
	}
	
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0, s);
        
        String str = my_string.substring(s, e + 1);
        for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(str.length() - 1 - i);
		}
        
        answer += my_string.substring(e + 1);
        
        return answer;
    }
    
    // 다른사람 풀이1 StringBuilder 와 reverse() 이용하기
//    public static String solution(String my_string, int s, int e) {
//        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
//        answer.reverse();
//        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
//    }
    
    // 다른 사람 풀이2 StringBuffer 과 reverse() 이용하기
//    public static String solution(String my_string, int s, int e) {
//	    StringBuffer answer = new StringBuffer();
//	    answer.append(my_string.substring(s,e+1));
//	    answer.reverse();
//	    return my_string.substring(0,s) + answer.toString() + my_string.substring(e+1);
//    }

}
