package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 무작위로K개의수뽑기 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 2, 2, 3};
		int k = 3;
		System.out.println(Arrays.toString(solution(arr, k)));
	}
	
    public static int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if(list.size() == k) break;
        	
        	if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
        if(list.size() < k) {
        	int len = list.size();
        	for (int i = 0; i < k - len; i++) {
				list.add(-1);
			}
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] arr, int k) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int a : arr)
//            if (!arrayList.contains(a))
//                arrayList.add(a);
//
//        int idx = 0;
//        int[] answer = new int[k];
//        for (int i = 0;i < k;i++)
//            answer[i] = -1;
//        for (int i = 0;i < k && i < arrayList.size();i++)
//            answer[i] = arrayList.get(i);
//        return answer;
//    }
    
}
