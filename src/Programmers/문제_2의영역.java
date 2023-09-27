package programmers;

import java.util.Arrays;

public class 문제_2의영역 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
		
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int[] arr) {
        int[] answer = {};
        
        int start = -1;
        int finish = -1;
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 2 && start == -1) {
				start = i;
				finish = i;
			}
			if(arr[i] == 2 && finish != i) {
				finish = i;
			}
		}
        
        if(start == -1 && finish == -1) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[finish - start +  1];
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[start++];
			}
        }
        
        return answer;
    }
    
}
