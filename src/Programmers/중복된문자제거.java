package programmers;

import java.util.ArrayList;

public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
        String answer = "";
        String[] s = my_string.split("");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
        	if(!list.contains(s[i])) {
        		answer += s[i];
        		list.add(s[i]);
        	}
        }
        return answer;
    }
    
    //중복되지 않는 set으 특성을 사용
//    public static String solution(String my_string) {
//        String[] answer = my_string.split("");
//        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//        return String.join("", set);
//    }
    
    //.indexOf() 사용 <현재 문자가 처음 등장하는 위치의 인덱스 확인 법>
//    public static String solution(String my_string) {
//        String answer = "";
//        for(int i=0; i<my_string.length(); i++){
//        	//처음등장하는 문자의 인덱스와 같다면
//	        if(i==my_string.indexOf(my_string.charAt(i))) 
//	        	answer+=my_string.charAt(i);
//	        }
//        return answer;
//    }

    //다른방법
//    public static String solution(String my_string) {
//        String answer = "";
//        for(int i=0; i<my_string.length(); i++){
//            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
//                answer += my_string.charAt(i);
//            }
//        }
//        return answer;
//    }
}
