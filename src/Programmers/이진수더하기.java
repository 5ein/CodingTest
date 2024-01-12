package programmers;

public class 이진수더하기 {

	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		System.out.println(solution(bin1, bin2));
	}
	
	//parseInt(String 문자열, int 진수) : int 진수를 10진수로 변환 시켜줌
	//Integer.toBinaryString(int값) : int값을 2진수로 변환 시켜줌
	public static String solution(String bin1, String bin2) {
		String answer = "";
		int num1 = Integer.parseInt(bin1, 2); //2진수 10진수 변환
		int num2 = Integer.parseInt(bin2, 2); //2진수 10진수 변환
		int sum = num1 + num2;
		answer = Integer.toBinaryString(sum); //10진수 2진수 변환
		return answer;
	}
    
//    public static String solution(String bin1, String bin2) {
//        String answer = "";
//        answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
//        return answer;
//    }

}
