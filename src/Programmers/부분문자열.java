package programmers;

public class 부분문자열 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aabcc";
		System.out.println(solution(str1, str2));
	}
	
    public static int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)) answer = 1;
        return answer;
    }
    
//    public static int solution(String str1, String str2) {
//        return str2.contains(str1) ? 1 : 0;
//    }

}
