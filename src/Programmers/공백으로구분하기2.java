package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공백으로구분하기2 {

	public static void main(String[] args) {
		String my_string = " i    love  you";
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
	//방법1
	public static String[] solution(String my_string) {
		String[] answer = {};
		
		ArrayList<String> list = new ArrayList<String>();
		String[] S = my_string.split(" ");
		for (String s : S) {
			
			//if(!s.equals("")) list.add(s); 
			//" " 말고 ""를 사용해야 비어있지 않음 문자열에 동작을 수행함
			if (!s.isEmpty()) list.add(s); 
		}
		
		answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	
	//방법2
	//trim() 과 split("\s+") 사용
	// \s 는 공백을 나타내는 특숨ㄴ자를 의미하고 +는 하나이상의 연속된 공백을 나타낸다.
	//연속되어도 하나의 구분자로 간주하여 단어를 분리하기 위함이다.
	//trim() 메서드를 이용해 가장 앞의 공백을 제거 해줌
//    public static String[] solution(String my_string) {
//        String[] answer = {};
//        
//        answer = my_string.trim().split("\\s+");
//        //"\s+"는 하나 이상의 공백을 의미
//        
//        return answer;
//    }
	
	//방법3
	//정규식 활용
//    public static String[] solution(String my_string) {
//        return my_string.trim().split("[ ]+");
//    }
	
	//방법4
	//StringTokenizer에 nextToken()함수를 쓰면, 
	//readLine()을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출 가능
//	public static String[] solution(String my_String) {
//
//		StringTokenizer st = new StringTokenizer(my_String);
//		int n = st.countTokens();
//		String[] answer = new String[n];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = st.nextToken();
//		}
//		
//		return answer;
//	}
    
}
