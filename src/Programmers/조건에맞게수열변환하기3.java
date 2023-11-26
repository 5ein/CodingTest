package programmers;

import java.util.Arrays;

public class 조건에맞게수열변환하기3 {

//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 100, 99, 98};
//		int k = 3;
//
//		int[] answer = new int[arr.length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(k % 2 == 0) {
//				answer[i] = arr[i] + k;
//			}else if (k % 2 >0) {
//				answer[i] = arr[i] * k;
//			}
//		}
//		
//		System.out.println(Arrays.toString(answer));
//	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		System.out.println(Arrays.toString(solution(arr, k)));
	}
	
    public static int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        answer = arr.clone();
        if(k % 2 == 0) {
        	for (int i = 0; i < answer.length; i++) {
				answer[i] += k;
			}
        } else {
        	for (int i = 0; i < answer.length; i++) {
        		answer[i] *= k;
        	}
        }
        
        return answer;
    }

}
