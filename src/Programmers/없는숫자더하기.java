package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {5, 8, 4, 0, 6, 7, 9};
		System.out.println(solution(numbers));
	}
	
    public static int solution(int[] numbers) {
    	Arrays.sort(numbers);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (int i : numbers) {
			list.add(i);
		}
    	int answer = 0;
		for (int i = 0; i <= 9; i++) {
			if(!list.contains(i)) answer += i;
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(int[] numbers) {
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
//    }
}
