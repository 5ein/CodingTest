package programmers;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		System.out.println(solution(cipher, code));
	}
    public static String solution(String cipher, int code) {
        String answer = "";
        
        for (int i = code - 1; i < cipher.length(); i+= code) {
			answer += cipher.charAt(i);
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static String solution(String cipher, int code) {
//        String answer = "";
//        for(int i=code-1; i<cipher.length(); i+=code){
//            answer += cipher.substring(i, i+1);
//        }
//        return answer;
//    }

}
