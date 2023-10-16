package programmers;

public class 소문자로바꾸기 {

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		System.out.println(solution(myString));
	}
	
//    public static String solution(String myString) {
//        String answer = "";
//        answer = myString.toLowerCase();
//        
//        return answer;
//    }
	
    public static String solution(String myString) {
    	String answer = "";
    	
    	char[] arr = myString.toCharArray();
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 97) {
				arr[i] += 32;
			}
			answer += arr[i];
		}
    	
    	return answer;
    }

}
