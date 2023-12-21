package programmers;

import java.util.Arrays;

public class OX퀴즈 {

	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		
		System.out.println(Arrays.toString(solution(quiz)));
	}
	
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
        	String[] arr = quiz[i].split(" ");
        	
        	int num1 = Integer.parseInt(arr[0]);
        	int num2 = Integer.parseInt(arr[2]);
        	int result = Integer.parseInt(arr[4]);
			
        	if(arr[1].equals("+")) {
        		if(num1 + num2 == result) answer[i] = "O";
        		else answer[i] = "X";
        	} else if(arr[1].equals("-")) {
        		if(num1 - num2 == result) answer[i] = "O";
        		else answer[i] = "X";
        	}
		}
        
        return answer;
    }

    //다른방법1
//	public static String[] solution(String[] quiz) {
//    	String[] answer = new String[quiz.length];
//    	for (int i = 0; i < quiz.length; i++) {
//			String[] arr = quiz[i].split(" ");
//			int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) * (arr[1].equals("+")? 1 : -1);
//			answer[i] = result == Integer.parseInt(arr[4])? "O" : "X";
//		}
//    	return answer;
//    }
    
    //다른방법2
//	public static String[] solution(String[] quiz) {
//		int size = quiz.length;
//		String[] answer = new String[size];
//		for (int i = 0; i < answer.length; i++) {
//			String[] splitQ = quiz[i].trim().split(" ");
//			int X = Integer.parseInt(splitQ[0]);
//			int Y = Integer.parseInt(splitQ[2]);
//			int Z = Integer.parseInt(splitQ[4]);
//			int cal = 0;
//			if (splitQ[1].equals("-")) {
//				cal = X - Y;
//			} else {
//				cal = X + Y;
//			}
//
//			answer[i] = Z == cal ? "O" : "X";
//		}
//		return answer;
//	}

}
