package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class ad제거하기 {
	
	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};
		System.out.println(Arrays.toString(solution(strArr)));
	}
	
//    public static String[] solution(String[] strArr) {
//        String[] answer = {};
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < strArr.length; i++) {
//			if(!strArr[i].contains("ad")) {
//				list.add(strArr[i]);
//			}
//		}
//        answer = new String[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//        return answer;
//    }
    
	//list.toArray(answer) 사용
    public static String[] solution(String[] strArr) {
    	String[] answer = {};
    	
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i = 0; i < strArr.length; i++) {
    		if(!strArr[i].contains("ad")) {
    			list.add(strArr[i]);
    		}
    	}
    	answer = new String[list.size()];
    	list.toArray(answer);
    	
    	return answer;
    }
}


