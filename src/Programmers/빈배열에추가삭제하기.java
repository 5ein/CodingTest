package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 빈배열에추가삭제하기 {

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		
		System.out.println(Arrays.toString(solution(arr, flag)));
	}
    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if(flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
				    list.remove(list.size() - 1);
				}
			}
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
    
    //스택 사용
//    public static int[] solution(int[] arr, boolean[] flag) {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < flag.length; i++) {
//            if (flag[i]) {
//                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
//            } else {
//                for (int j = 0; j < arr[i]; j++) stack.pop();
//            }
//        }
//
//        return stack.stream().mapToInt(Integer::intValue).toArray();
//    }

}
