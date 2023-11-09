package programmers;

import java.util.Arrays;

public class 뒤에서5등위로 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		
		System.out.println(Arrays.toString(solution(num_list)));
	}

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        
        Arrays.sort(num_list);
        
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] numList) {
//        return Arrays.stream(numList).sorted().skip(5).toArray();
//    }

}
