package programmers;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		System.out.println(solution(my_string));
	}
	
    public static int solution(String my_string) {
        int answer = 0;
        String str = my_string.toLowerCase().replaceAll("[a-z]","");
        for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(i) - '0';
		}
        return answer;
    }
    
//    public static int solution(String my_string) {
//        int answer = 0;
//        String str = my_string.replaceAll("[^0-9]","");
//
//        for(char ch : str.toCharArray()) {
//            answer += Character.getNumericValue(ch);
//        }
//
//        return answer;
//    }
    
//    public static int solution(String my_string) {
//        int answer = 0;
//
//        for(char c : my_string.toCharArray()){
//            if(c >= '0' && c <= '9'){
//                answer += c - '0';
//            }
//        }
//        return answer;
//    }

}
