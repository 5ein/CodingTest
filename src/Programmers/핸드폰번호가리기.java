package programmers;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	
    public static String solution(String phone_number) {
        String answer = "";
        int idx = phone_number.length() - 4;
        for (int i = 0; i < idx; i++) {
			answer += "*";
		}
        answer += phone_number.substring(idx);
        return answer;
    }
//    public static String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
//    }
//    
//	public static String solution(String phone_number) {
//		return phone_number.replaceAll(".(?=.{4})", "*");
////		. -> 임의의 문자 한 개 
////		(?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택
////		{숫자} -> 숫자 만큼의 자릿수
////		.(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
//	}

}
