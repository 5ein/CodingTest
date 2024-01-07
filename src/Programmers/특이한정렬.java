package programmers;

import java.util.Arrays;

public class 특이한정렬 {

	public static void main(String[] args) {
		int[] numlist = {10000,20,36,47,40,6,10,7000};
		int n = 30;
		System.out.println(Arrays.toString(solution(numlist, n)));
	}
	
    public static int[] solution(int[] numlist, int n) {
        int[] answer = numlist.clone();
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(Math.abs(n - answer[i]) <= Math.abs(n - answer[j])) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
        return answer;
    }

}
