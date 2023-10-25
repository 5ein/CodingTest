package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x사이의개수 {

	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		
		System.out.println(Arrays.toString(solution(myString)));
	}
	
	//endsWith() 사용
    public static int[] solution(String myString) {
        int[] answer = {};
        
        if(myString.endsWith("x")) {
        	myString += " ";
        }
        String[] S = myString.split("x");
        answer = new int[S.length];
        for (int i = 0; i < answer.length; i++) {
        	int length = S[i].length();
        	if(S[i].equals(" ")) {
        		length = 0;
        	}
			answer[i] = length;
		}
        
        return answer;
    }
    
    //lastIndexOf() 사용
//    public static int[] solution(String myString) {
//    	int[] answer = {};
//    	
//    	if(myString.lastIndexOf("x") == (myString.length() - 1)) {
//    		myString += " ";
//    	}
//    	String[] S = myString.split("x");
//    	answer = new int[S.length];
//    	for (int i = 0; i < answer.length; i++) {
//    		int length = S[i].length();
//    		if(S[i].equals(" ")) {
//    			length = 0;
//    		}
//    		answer[i] = length;
//    	}
//    	
//    	return answer;
//    }
    
    //다른사람 풀이
//    public static int[] solution(String myString) {
//        ArrayList<Integer> list = new ArrayList<>();
//        String[] tmp = myString.split("x");
//        for (int i = 0; i < tmp.length; i++) {
//            list.add(tmp[i].length());
//        }
//        if(myString.endsWith("x")) {
//            list.add(0);
//        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
    
//    public static int[] solution(String myString) {
//    	int[] answer = {};
//        int std = 0;
//        String[] arr = myString.split("");
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].equals("x")) {
//                std++;
//            } else {
//                list.add(std);
//                std = 0;
//            }
//        }
//
//        list.add(std);
//        
//        answer = new int[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//
//        return answer;
//    }

}
