package programmers;

import java.util.Arrays;

public class 배열의원소만큼추가하기 {

	public static void main(String[] args) {
		int[] arr = {5, 1, 4};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int[] arr) {
        int[] answer = {};
        
        int n = 0;
        for (int i : arr) {
			n += i;
		}
        int m = 0;
        answer = new int[n];
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[m++] = arr[i]; 
			}
		}
        
        return answer;
    }

}
