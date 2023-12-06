package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		String my_string = "p2o4i8gj2";
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
    public static int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
        	char w = my_string.charAt(i);
			if(w >= 48 &&  w <= 57) {
				list.add(w + "");
			}
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(String my_string) {
//
//        my_string = my_string.replaceAll("[a-z]","");
//
//        int[] answer = new int[my_string.length()];
//
//        for(int i =0; i<my_string.length(); i++){
//            answer[i] = my_string.charAt(i) - '0'; 
    		  //char타입을 숫자로 연산할 경우'0'을 빼주면 의도한 점수 숫자가 나옴
//        }
//
//        Arrays.sort(answer);
//
//        return answer;
//    }

}
