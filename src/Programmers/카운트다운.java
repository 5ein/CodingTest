package programmers;

import java.util.Arrays;

public class 카운트다운 {

	public static void main(String[] args) {
		int start = 10;
		int end_num = 3;
		
		System.out.println(Arrays.toString(solution(start, end_num)));
	}
	
    public static int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int num = start;
        for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num--;
		}
        
        return answer;
    }
    
    //i를 빼는 방법 사용
//    public static int[] solution(int start, int end) {
//        int[] answer = {};
//    	  answer = new int[start - end + 1];
//        for(int i = 0; i<= start - end; i++) {
//            answer[i] = start - i;
//        }
//        return answer;
//    }
    
}
