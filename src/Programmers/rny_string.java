package programmers;

public class rny_string {

	public static void main(String[] args) {
		String rny_string = "programmers";
		
		System.out.println(solution(rny_string));
	}
	
    public static String solution(String rny_string) {
        String answer = "";
        
        answer = rny_string.replace("m", "rn");
        
        return answer;
    }

}
