package programmers;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		System.out.println(Arrays.toString(solution(my_str, n)));
	}

    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = my_str.length() % n == 0? my_str.length() / n : my_str.length() / n + 1;
        answer = new String[length];
        
        for (int i = 0; i < answer.length; i++) {
        	int endIndex = Math.min(n, my_str.length());
			answer[i] = my_str.substring(0, endIndex);
			my_str = my_str.substring(endIndex);
		}
        return answer;
    }
    
//    public static String[] solution(String my_str, int n) {
//        int resultCnt = (my_str.length() + n - 1) / n;
//        String[] answer = new String[resultCnt];
//
//        for (int i = 0; i < resultCnt; i++) {
//            int start = n * i;
//            int end = start + n >= my_str.length()? my_str.length(): start + n;
//            answer[i] = my_str.substring(start, end);
//        }
//
//        return answer;
//    }
    
//    public static String[] solution(String my_str, int n){
//        int cnt = (my_str.length() + n - 1) / n;
//        String[] answer = new String[cnt];
//
//        for(int i = 0; i < cnt; i++){
//           int start = n * i;
//           int end = 0;
//           if(start + n >= my_str.length()){
//               end = my_str.length();
//           } else {
//               end = start + n;
//           }
//           answer[i] = my_str.substring(start, end);
//       }
//       return answer;
//    }
	
}
