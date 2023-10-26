package programmers;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.StringTokenizer;

public class 문자열잘라서정렬하기 {

	public static void main(String[] args) {
		String myString = "axbxcxdx";
		
		System.out.println(Arrays.toString(solution(myString)));
	}
	
    public static String[] solution(String myString) {
        String[] answer = {};
        
        String[] Str = myString.split("x");
		ArrayList<String> S = new ArrayList<String>();
		for (String s : Str) {
			if(!s.isEmpty()) {
				S.add(s);
			}
		}
		answer = new String[S.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = S.get(i);
		}
        Arrays.sort(answer);
        
        return answer;
    }
	
	//StringTokenizer 사용
//    public static String[] solution(String myString) {
//    	String[] answer = {};
//    	
//    	StringTokenizer st = new StringTokenizer(myString, "x");
//    	int n = st.countTokens();
//    	answer = new String[n];
//    	for (int i = 0; i < n; i++) {
//			answer[i] = st.nextToken();
//		}
//    	Arrays.sort(answer);
//    	
//    	return answer;
//    }
    
    //toArray() 사용
//    public static String[] solution(String myString) {
//        String[] splitStrings = myString.split("x");
//        List<String> resultList = new ArrayList<>();
//        for (String s : splitStrings) {
//            if (!s.equals("")) {
//                resultList.add(s);
//            }
//        }
//        String[] resultArray = new String[resultList.size()];
//        resultList.toArray(resultArray);
//        Arrays.sort(resultArray);
//        return resultArray;
//    }
    
}
