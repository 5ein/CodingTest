package programmers;

import java.util.Arrays;

public class 공백으로구분하기1 {

	public static void main(String[] args) {
		String my_string = "i love you";
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
    public static String[] solution(String my_string) {
        String[] answer = {};
        
        answer = my_string.split(" ");
        
        return answer;
    }

}
