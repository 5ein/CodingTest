package programmers;

public class 대문자와소문자 {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		System.out.println(solution(my_string));
	}
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if(c < 97) {
				c += 32;
			}else {
				c -= 32;
			}
			answer += c;
		}
        
        return answer;
    }
    
//    public static String solution(String s) {
//        String answer = "";
//
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>=97 && s.charAt(i)<=122){
//                answer += (char)(s.charAt(i)-32);
//            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
//                answer += (char)(s.charAt(i)+32);
//            } else {
//                answer += s.charAt(i);
//            }
//        }
//
//        return answer;
//    }

}
