package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의원소삭제하기 {

	public static void main(String[] args) {
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		System.out.println(Arrays.toString(solution(arr, delete_list)));
	}
    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
			list.add(i);
		}
        for (int i : delete_list) {
			if(list.contains(i)) {
				list.remove(Integer.valueOf(i));
			}
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }

}
