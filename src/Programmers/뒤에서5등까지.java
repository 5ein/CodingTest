package programmers;

import java.util.Arrays;

public class 뒤에서5등까지 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		System.out.println(Arrays.toString(solution(num_list)));
	}
	
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = new int[5];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] num_list) {
//        Arrays.sort(num_list);
//
//        return Arrays.copyOfRange(num_list, 0, 5);
//    }

}
