package programmers;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		System.out.println(solution(my_string));
	}
	
	// \\d : [0-9]와 동일한 의미를 가진다. 0-9까지의 숫자
    //  ^  : 정규표현식에서 "부정"을 나타내는 메타문자.
    // 즉 [^\\d]는 숫자가 아닌 모든 문자를 뜻한다.
//    public static int solution(String my_string) {
//        int answer = 0;
//        my_string = my_string.replaceAll("[^\\d]",  " ");
//        String[] str = my_string.split(" ");
//        for (String s : str) {
//        	if(!s.isEmpty()) answer += Integer.parseInt(s);
//		}
//        return answer;
//    }
    
    public static int solution(String my_string) {
    	int answer = 0;
    	String[] str = my_string.split("[a-zA-z]");
    	for (String s : str) {
    		if(!s.isEmpty()) answer += Integer.parseInt(s);
    	}
    	return answer;
    }
    
//    public static int solution(String my_string) {
//        int answer = 0;
//
//        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
//
//        for(String s : str){
//            if(!s.equals("")) answer += Integer.valueOf(s);
//        }
//
//        return answer;
//    }

}
