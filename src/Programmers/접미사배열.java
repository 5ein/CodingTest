package programmers;

import java.util.Arrays;

public class 접미사배열 {

	public static void main(String[] args) {
		String my_string = "programmers";
		
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
//    public static String[] solution(String my_string) {
//        ArrayList<String> list = new ArrayList<>();
//    	
//        for (int i = 0; i < my_string.length(); i++) {
//			list.add(my_string.substring(i));
//		}
//        
//        String[] answer = new String[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//        
//        Arrays.sort(answer);
//        return answer;
//    }
    
	//다른 풀이
    public static String[] solution(String my_string) {
    	String[] answer = new String[my_string.length()];
    	
    	for (int i = 0; i < my_string.length(); i++) {
    		answer[i] = my_string.substring(i);
    	}
    	
    	Arrays.sort(answer);
    	return answer;
    }
}
