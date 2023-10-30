package programmers;

import java.util.Arrays;

public class 세개의구분자 {

	public static void main(String[] args) {
		String myStr = "baconlettucetomato";
		
		System.out.println(Arrays.toString(solution(myStr)));
	}
	
    public static String[] solution(String myStr) {
        String[] answer = {};
        
        answer = myStr.replace("a", " ").replace("b", " ").replace("c", " ").trim().split("\\s+");
        
        if(answer.length == 1 && answer[0].equals("")) answer[0] = "EMPTY";
        
        return answer;
    }
	
//	public static String[] solution(String myStr) {
//		String[] answer = {};
//		
//		ArrayList<String> list = new ArrayList<>();
//		String[] S = myStr.split("a|b|c");
//		for(String a: S){
//			if(a.length() > 0){
//				list.add(a);
//			}
//		}
//		
//		if(list.size() == 0) {
//			answer = new String[1];
//			answer[0] = "EMPTY";
//		}else {
//			answer = new String[list.size()];
//			for(int i = 0 ; i < answer.length; i++){
//				answer[i] = list.get(i);
//			}
//		}
//		
//		return answer;
//	}
    
    //다른사람 풀이 StringTokenizer 사용
//    public static String[] solution(String myStr) {
//        String[] answer = {};
//        StringTokenizer st = new StringTokenizer(myStr,"abc");
//        if(st.countTokens() != 0){
//            answer = new String[st.countTokens()];
//            for(int i=0; i<answer.length; i++){
//                answer[i] = st.nextToken();
//            }
//        }else{
//            answer = new String[1];
//            answer[0] = "EMPTY";
//        }
//
//        return answer;
//    }

}
