package programmers;

import java.util.Arrays;

public class 문제_5명씩 {

	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		System.out.println(Arrays.toString(solution(names)));
	}
	
//    public static String[] solution(String[] names) {
//    	String[] answer = {};
//    	
//    	int length = names.length / 5;
//    	if(names.length % 5 != 0) {
//    		length = names.length / 5 + 1;
//    	}
//        answer = new String[length];
//        for (int i = 0, j = 0; i < answer.length; i++) {
//			answer[i] = names[j];
//			j += 5;
//		}
//        
//        return answer;
//    }
	
    public static String[] solution(String[] names) {
    	String[] answer = {};
    	
    	int length = names.length / 5;
    	if(names.length % 5 != 0) {
    		length = names.length / 5 + 1;
    	}
    	answer = new String[length];
    	for (int i = 0, j = 0; i < names.length; i+=5) {
    		answer[j++] = names[i];
    	}
    	
    	return answer;
    }
    
    //다른사람 풀이1
//    public static String[] solution(String[] names) {
//        int idx = 0;
//        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
//        for (int i = 0;i < names.length;i+=5)
//            answer[idx++] = names[i];
//        return answer;
//    }
    
    //다른사람 풀이2
//    public static String[] solution(String[] names) {
//        String[] answer = new String[(names.length-1)/5+1];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = names[5*i];
//        }
//        return answer;
//    }

}
