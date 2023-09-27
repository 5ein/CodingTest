package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기3 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}; 
		int[][] intervals = {{1, 3}, {0, 4}};
		
		System.out.println(Arrays.toString(solution(arr, intervals)));
	}
	
    public static int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
			list.add(arr[i]);
		}
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
			list.add(arr[i]);
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }

}
