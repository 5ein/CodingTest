package programmers;

import java.util.Arrays;

public class 배열조각하기 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		
		System.out.println(Arrays.toString(solution(arr, query)));
		
	}
	
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        
        for (int i = 0; i < query.length; i++) {
        	if(i % 2 == 0) {
        		answer = Arrays.copyOfRange(answer, 0, query[i]+1);
            }else {
            	answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
		}
        
        return answer;
    }

}
