package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 배열만들기6 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 1, 0};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	//while
//    public static int[] solution(int[] arr) {
//        int[] answer = {};
//        
//        ArrayList<Integer> stk = new ArrayList<Integer>();
//        int i = 0;
//        while(i < arr.length) {
//        	if(stk.isEmpty()) {
//        		stk.add(arr[i]);
//        		i++;
//        	}else if(!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
//        		stk.remove(stk.size() - 1);
//        		i++;
//        	}else if(!stk.isEmpty() && stk.get(stk.size() - 1) != arr[i]) {
//        		stk.add(arr[i]);
//        		i++;
//        	}
//        }
//       if(stk.size() == 0){
//        	answer = new int[1];
//        	answer[0] = -1;
//        }else {
//        	answer = new int[stk.size()];
//        	for (int j = 0; j < answer.length; j++) {
//        		answer[j] = stk.get(j);
//        	}
//        }
//        
//        return answer;
//    }
    
	//for
//    public static int[] solution(int[] arr) {
//    	int[] answer = {};
//    	
//    	ArrayList<Integer> stk = new ArrayList<Integer>();
//    	
//    	for (int i = 0; i < arr.length; i++) {
//			if(i < arr.length) {
//				if(stk.isEmpty()) {
//	    			stk.add(arr[i]);
//	    		}else if(!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
//	    			stk.remove(stk.size() - 1);
//	    		}else if(!stk.isEmpty() && stk.get(stk.size() - 1) != arr[i]) {
//	    			stk.add(arr[i]);
//	    		}
//			}
//		}
//    	
//        if(stk.size() == 0){
//        	answer = new int[1];
//        	answer[0] = -1;
//        }else {
//        	answer = new int[stk.size()];
//        	for (int j = 0; j < answer.length; j++) {
//        		answer[j] = stk.get(j);
//        	}
//        }
//    	
//    	return answer;
//    }
    
	//stack 이용
    public static int[] solution(int[] arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
			if(!stack.isEmpty() && i == stack.peek()) {
				stack.pop();
			}else {
				stack.push(i);
			}
		}
        
       if(stack.size() == 0){
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[stack.size()];
        	for (int j = 0; j < answer.length; j++) {
        		answer[j] = stack.get(j);
        	}
        }
        
        return answer;
    }
}
