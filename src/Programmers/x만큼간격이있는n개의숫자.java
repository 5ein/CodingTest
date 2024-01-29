package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println(Arrays.toString(solution(x, n)));
	}
	
    public static long[] solution(int x, int n) {
        ArrayList<Long> list = new ArrayList<Long>();
        Long X = (long)x;
        for (int i = 0; i < n; i++) {
			list.add(X);
			X += (long)x;
		}
        long[] answer = new long[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }

}
