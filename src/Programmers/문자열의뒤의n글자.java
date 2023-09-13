package programmers;

public class 문자열의뒤의n글자 {

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		
		System.out.println(solution(my_string, n));
	}
	
    public static String solution(String my_string, int n) {
        String answer = "";

        answer += my_string.substring(my_string.length() - n, my_string.length());
        //위와 같음
//      answer += my_string.substring(my_string.length() - n);
        
        return answer;
    }
}
