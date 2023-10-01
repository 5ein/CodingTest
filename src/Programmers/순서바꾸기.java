package programmers;

import java.util.Arrays;

public class 순서바꾸기 {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
	
    public static int[] solution(int[] num_list, int n) {
        int[] zero_n = Arrays.copyOfRange(num_list, 0, n + 1);
        int[] n_last = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < n_last.length; i++) {
			answer[i] = n_last[i];
		}
        for (int i = n_last.length; i < answer.length; i++) {
			answer[i] = zero_n[i - n_last.length];
		}
        
        return answer;
    }
    
    // 다른사람 풀이
//    public static int[] solution(int[] num_list, int n) {
//        int idx = 0;
//        int[] answer = new int[num_list.length];
//        for (int i = n;i < num_list.length;i++)
//            answer[idx++] = num_list[i];
//        for (int i = 0;i < n;i++)
//            answer[idx++] = num_list[i];
//        return answer;
//    }

}
