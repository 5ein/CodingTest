package programmers;

import java.util.Arrays;

public class n번째원소부터 {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;
		
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
	
//    public static int[] solution(int[] num_list, int n) {
//        int[] answer = {};
//        
//        answer = new int[num_list.length - n + 1];
//        for (int i = n - 1, j = 0; i < num_list.length; i++) {
//			answer[j++] = num_list[i];
//		}
//        
//        return answer;
//    }
    
	//Arrays.copyOfRange() 사용하기!
    public static int[] solution(int[] num_list, int n) {
    	int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
    	return answer;
    }

}
