package programmers;

public class 원하는문자열찾기 {

	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		System.out.println(solution(myString, pat));
	}
	
//    public static int solution(String myString, String pat) {
//        int answer = 0;
//        
//        if(myString.toUpperCase().contains(pat.toUpperCase())) {
//        	answer = 1;
//        }
//        
//        return answer;
//    }
    
    public static int solution(String myString, String pat) {
    	int answer = 0;
    	
    	answer = myString.toUpperCase().contains(pat.toUpperCase())? 1 : 0; 
    	
    	return answer;
    }

}
