package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		System.out.println(Arrays.toString(solution(array)));
	}
	
    public static int[] solution(int[] array) {
    	HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
			map.put(array[i], i);
		}
        int[] answer = new int[2];
        Arrays.sort(array);
        answer[0] = array[array.length - 1];
        answer[1] = map.get(array[array.length - 1]);
        return answer;
    }
    
//    public static int[] solution(int[] array) {
//        int[] answer = new int[2];
//
//        for(int i=0;i<array.length;i++) {
//            if(array[i] > answer[0]) {
//                answer[0] = array[i];
//                answer[1] = i;
//            }
//        }
//
//        return answer;
//    }
    
//    public static int[] solution(int[] array) {
//        int max = 0;
//        int maxIndex = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//                maxIndex = i;
//            }
//        }
//        int[] answer = {max, maxIndex};
//        return answer;
//    }

}
