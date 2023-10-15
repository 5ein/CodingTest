package programmers;

public class 대문자로바꾸기 {

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		System.out.println(solution(myString));
	}
    public static String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }

}
