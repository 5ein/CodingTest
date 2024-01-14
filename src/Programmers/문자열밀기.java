package programmers;

import java.util.Arrays;

public class 문자열밀기 {

	public static void main(String[] args) {
		String A = "apple";
		String B = "elppa";
		System.out.println(solution(A, B));
	}
	
    public static int solution(String A, String B) {
        int answer = -1;
        String copy = A;
        for (int i = 0; i < copy.length(); i++) {
			if(copy.equals(B)) {
				answer = i;
				break;
			}
			
			String a = copy.substring(copy.length() - 1);
			copy = a + copy.substring(0, copy.length() - 1);
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(String A, String B) {
//
//        return (B+B).indexOf(A);
//    }

}
