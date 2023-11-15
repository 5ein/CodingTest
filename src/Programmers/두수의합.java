package programmers;

import java.math.BigInteger;

public class 두수의합 {

	public static void main(String[] args) {
		String a = "582";
		String b = "734";

		System.out.println(solution(a, b));
	}
	
    public static String solution(String a, String b) {
        String answer = "";
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);
        answer = sum.toString();
        return answer;
    }
    
    //다른사람 풀이
//    public static String solution(String a, String b) {
//        String answer = "";
//
//        BigInteger A = new BigInteger(a);
//        BigInteger B = new BigInteger(b);
//
//        answer += A.add(B); //이렇게 스트링으로 바로 바뀌게 더해줬음
//
//        return answer;
//    }

}
