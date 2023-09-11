package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기5 {

	public static void main(String[] args) {
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		int k = 50000;
		int s = 5;
		int l = 5;
		
		System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
		
	}
	// 내풀이
//    public static int[] solution(String[] intStrs, int k, int s, int l) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < intStrs.length; i++) {
//        	String m = intStrs[i].substring(s, s + l);
//        	int n = Integer.parseInt(m);
//        	
//        	if(n > k) list.add(n);
//		}
//        
//    	int[] answer = new int[list.size()];
//    	for (int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
//    	
//        return answer;
//    }
	
	//다른사람 풀이
    public static int[] solution(String[] intStrs, int k, int s, int l) {
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	for(String i : intStrs) {
    		int n = Integer.parseInt(i.substring(s, s + l));
    		
    		if(n > k) list.add(n);
    	}
    	
    	int[] answer = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
    		answer[i] = list.get(i);
    	}
    	
    	return answer;
    }

}
