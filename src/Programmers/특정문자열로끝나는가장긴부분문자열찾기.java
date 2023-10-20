package programmers;

public class 특정문자열로끝나는가장긴부분문자열찾기 {

	public static void main(String[] args) {
		String myString = "AbCdEFG";
		String pat = "dE";
		System.out.println(solution(myString, pat));
	}
	
	//endsWith() 사용
//    public static String solution(String myString, String pat) {
//        String answer = "";
//        
//        for (int i = myString.length() - 1; i >= 0; i--) {
//			String substr = myString.substring(0, i + 1);
//			if(substr.endsWith(pat)) {
//				answer = substr;
//				break;
//			}
//		}
//        
//        return answer;
//    }
    
    //lastIndexOf() 사용
    public static String solution(String myString, String pat) {
        String answer = "";

        int idx = myString.lastIndexOf(pat);

        answer = myString.substring(0, idx) + pat;

        return answer;
    }
    
    //lastIndexOf() 사용2
//    public static String solution(String myString, String pat) { 
//        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
//    }
}
