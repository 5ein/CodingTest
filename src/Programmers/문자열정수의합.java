package programmers;

public class 문자열정수의합 {

	public static void main(String[] args) {
		String num_str = "123456789";
		System.out.println(solution(num_str));
	}
	
    public static int solution(String num_str) {
        int answer = 0;
        String[] s = num_str.split("");
        for (int i = 0; i < s.length; i++) {
			answer += Integer.parseInt(s[i]);
		}
        return answer;
    }
    
    //char 이용하려면 -48 해야함
//    public static int solution(String num_str) {
//        int answer = 0;
//
//        for(int i = 0; i < num_str.length(); i++){
//            answer += (int)num_str.charAt(i) - 48;
//        }
//
//        return answer;
//    }

}
