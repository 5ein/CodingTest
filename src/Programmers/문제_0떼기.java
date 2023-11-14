package programmers;

public class 문제_0떼기 {

	public static void main(String[] args) {
		String n_str = "0010";
		
		System.out.println(solution(n_str));
	}
	
    public static String solution(String n_str) {
        String answer = "";
        answer = Integer.parseInt(n_str) + "";
        return answer;
    }
    
//    public static String solution(String n_str) {
//    	String answer = "";
//    	answer = String.valueOf(Integer.parseInt(nStr));
//    	return answer;
//    }

}
