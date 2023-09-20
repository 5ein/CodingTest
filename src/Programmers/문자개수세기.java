package programmers;

import java.util.Arrays;

public class 문자개수세기 {
	public static void main (String[] args) {
		String my_string = "Programmers";
		
		System.out.println(Arrays.toString(solution(my_string)));
		
//		[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
//		 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
//		 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 
//		 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
	}
	
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < my_string.length(); i++) {
        	char c = my_string.charAt(i);
        	
			int idx = c < 'a' ? c - 65 : c - 71;
			answer[idx]++;
		}
        
        return answer;
    }
}
