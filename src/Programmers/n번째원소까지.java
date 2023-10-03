package programmers;

import java.util.Arrays;

public class n번째원소까지 {

	public static void main(String[] args) {
//		int[] num_list = {2, 1, 6};
//		int n = 1;
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
	
    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[n];
        for (int i = 0; i <= n - 1; i++) {
			answer[i] = num_list[i];
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] num_list, int n) {
//        int[] answer = {};
//
//        answer = Arrays.copyOfRange(num_list,0,n);
//
//        return answer;
//    }

}
