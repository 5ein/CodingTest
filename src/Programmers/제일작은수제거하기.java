package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int[] arr) {
    	int[] answer;
        if(arr.length == 1) {
        	answer = new int[]{-1}; //아래 두줄을 한줄로(answer = {-1}아님..)
//        	answer = new int[1];
//        	answer[0] = -1;
        } else {
        	List<Integer> list = new ArrayList<>();
        	for (int i : arr) list.add(i);
        	Arrays.sort(arr);
        	list.remove((Integer)arr[0]);
        	answer = new int[list.size()];
        	for (int i = 0; i < answer.length; i++) {
        		answer[i] = list.get(i);
        	}
        }
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] arr) {
//        int[] answer = {};
//
//        if (arr.length == 1) {
//          answer = new int[]{-1};
//        } else {
//          List<Integer> list = new ArrayList<>();
//          for (int a : arr)
//            list.add(a);
//          list.remove(Collections.min(list));
//          answer = new int[arr.length - 1];
//          for (int i = 0; i < list.size(); i++)
//            answer[i] = list.get(i);
//        }
//        return answer;
//      }
}
