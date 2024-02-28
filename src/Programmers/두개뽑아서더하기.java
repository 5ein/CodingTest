package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if(!list.contains(sum)) {
					list.add(sum);
				}
			}
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        Arrays.sort(answer);
        return answer;
    }
    
    // 다른사람 풀이
//    public static int[] solution(int[] numbers) {
//        Set<Integer> set = new HashSet<>();
//
//        for(int i=0; i<numbers.length; i++) {
//            for(int j=i+1; j<numbers.length; j++) {
//                set.add(numbers[i] + numbers[j]);
//            }
//        }
//
//        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
//    }
    
}
