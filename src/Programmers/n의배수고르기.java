package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		int n = 5;
		int[] numlist = {1, 9, 3, 10, 13, 5};
		System.out.println(Arrays.toString(solution(n, numlist)));
	}
	
    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) list.add(numlist[i]);
		}
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
    
//    public static int[] solution(int n, int[] numlist) {
//        int count = 0;
//        for(int i : numlist){
//            if(i%n==0){
//                count++;
//            }
//        }
//
//        int[] answer = new int[count];
//        int idx = 0;
//        for(int i : numlist){
//            if(i%n==0){
//                answer[idx]=i;
//                idx++;
//            }
//        }
//
//        return answer;
//    }

}
