package programmers;

public class l로만들기 {

	public static void main(String[] args) {
		String myString = "abcdevwxyz";
		System.out.println(solution(myString));
	}
	
    public static String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
			
        	if(myString.charAt(i) < 'l') {
        		answer += 'l';
        	} else {
        		answer += myString.charAt(i);
        	}
		}
        
        return answer;
    }

}
