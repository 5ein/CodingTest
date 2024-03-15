package programmers;

public class 문자열나누기 {

	public static void main(String[] args) {
		String s = "banana";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        int answer = 1;

        char x = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                x = s.charAt(i);
            }

            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }

        return answer;
    }
	
	// 틀린방법: 시간초과됨
//    public static int solution(String s) {
//        int answer = 0;
//        int index = 0;
//        while (index < s.length()) {
//        	answer++;
//        	String str = s.substring(index);
//        	int same = 0;
//        	int different = 0;
//        	char first = str.charAt(0);
//        	
//        	for (int i = 0; i < str.length(); i++) {
//        		char c = str.charAt(i);
//        		if(first == c) same++;
//        		else different++;
//        		
//        		if(same == different) {
//        			index += (i + 1);
//        			break;
//        		}
//        	}
//		}
//        
//        return answer;
//    }
    
    //다른방법
//    public static int solution(String s) {
//        int answer = 1;
//
//        char x = s.charAt(0);
//        int count = 1;
//        for (int i = 1; i < s.length(); i++) {
//            if (count == 0) {
//                answer++;
//                x = s.charAt(i);
//            }
//
//            if (x == s.charAt(i)) count++;
//            else count--;
//        }
//
//        return answer;
//    }
}
