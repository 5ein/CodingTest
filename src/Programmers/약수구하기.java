package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 29;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	//ArrayList 사용
    public static int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        Arrays.sort(answer);
        return answer;
    }
    
	//HashSet와 Iterator 사용
//    public static int[] solution(int n) {
//    	int[] answer = {};
//    	HashSet<Integer> set = new HashSet<>();
//    	for (int i = 1; i <= n; i++) {
//    		if(n % i == 0) {
//    			set.add(i);
//    			set.add(n / i);
//    		}
//    	}
//    	answer = new int[set.size()];
//    	Iterator<Integer> iter = set.iterator();
//    	for (int i = 0; i < answer.length; i++) {
//    		answer[i] = iter.next();
//    	}
//    	Arrays.sort(answer);
//    	return answer;
//    }
    
	//HashSet 사용
//    public static int[] solution(int n) {
//    	int[] answer = {};
//    	HashSet<Integer> set = new HashSet<>();
//    	for (int i = 1; i <= n; i++) {
//    		if(n % i == 0) {
//    			set.add(i);
//    			set.add(n / i);
//    		}
//    	}
//    	answer = new int[set.size()];
//    	int j = answer.length - 1;
//    	for (Integer i : set) {
//			answer[j--] = i;
//		}
//    	Arrays.sort(answer);
//    	return answer;
//    }

}
