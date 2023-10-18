package programmers;

public class A강조하기 {

	public static void main(String[] args) {
		String myString = "abstract algebra";
		
		System.out.println(solution(myString));
	}
    public static String solution(String myString) {
        String answer = "";
        
    	answer = myString.toLowerCase();
    	answer = answer.replace('a', 'A');
        
        return answer;
    }
}
