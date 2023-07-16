package programmers고득점Kit;

import java.util.ArrayList;
import java.util.Arrays;

public class 스택큐_같은숫자는싫어 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		// 방법1
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = -1;
		for (int i : arr) {
			if(num != i)
				list.add(i);
			num = i;
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).intValue();
		}
		
		
		// 방법2
//		 int j = 0;
//	        int[] temp = new int[arr.length];
//	        for (int i = 0; i < arr.length - 1; i++) {
//	            if(arr[i] != arr[i+1]) {
//	                temp[j++] = arr[i];
//	            }
//	        }
//	        temp[j++] = arr[arr.length - 1];
//
//	        int[] answer = new int[j];
//	        for (int i = 0; i < j; i++) {
//	            answer[i] = temp[i];
//	        }

		
		System.out.println(Arrays.toString(answer));
	}
}
