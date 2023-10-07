package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 할일목록 {

	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		System.out.println(Arrays.toString(solution(todo_list, finished)));
	}
    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < finished.length; i++) {
			if(finished[i] == false) { //!finished[i] 와 같음!!
				list.add(todo_list[i]);
			}
		}
        
        answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static String[] solution(String[] todo_list, boolean[] finished) {
//        String str = "";
//        for(int i=0; i<finished.length; i++){
//            str = finished[i]==false ? str+todo_list[i]+"," : str;
//        }
//
//        return str.split(",");
//    }

}
