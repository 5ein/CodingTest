package baekjoon;

import java.util.Stack;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		System.out.println(solution(food));
	}
	
//    public static String solution(int[] food) {
//        String answer = "";
//        for (int i = 0; i < food.length; i++) {
//			if(food[i] > 1) {
//				int n = food[i] / 2;
//				for (int j = 0; j < n; j++) {
//					answer += Integer.toString(i);
//				}
//			}
//		}//for
//        answer += "0";
//        for (int i = answer.length() - 2; i >= 0; i--) {
//			answer += answer.charAt(i);
//		}
//        return answer;
//    }
    
    public static String solution(int[] food) {
    	String answer = "";
    	Stack<Integer> stack = new Stack<>();
    	for (int i = 0; i < food.length; i++) {
    		if(food[i] > 1) {
    			int n = food[i] / 2;
    			for (int j = 0; j < n; j++) {
    				answer += Integer.toString(i);
    				stack.add(i);
    			}
    		}
    	}//for
    	answer += "0";
    	while (!stack.empty()) {
    		answer += stack.pop();
		}
    	return answer;
    }
    
    //다른사람 코드
//    public static String solution(int[] food) {
//        String answer = "0";
//
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) {
//                answer = i + answer + i; 
//            }
//        }
//
//        return answer;
//    }

}
