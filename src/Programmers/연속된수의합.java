package programmers;

import java.util.Arrays;

public class 연속된수의합 {

	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		System.out.println(Arrays.toString(solution(num, total)));
	}
	
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = (total / num) - ((num - 1) / 2); //첫번째 값 정하기
        for (int i = 0; i < num; i++) {
			answer[i] = n;
			n++;
		}
        return answer;
    }

}
