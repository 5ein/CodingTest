package programmers;

public class 문제_9로나눈나머지 {

	public static void main(String[] args) {
		
		String number = "78720646226947352489";
		
		System.out.println(solution(number));
		
	}
	
    public static int solution(String number) {
        int answer = 0;
        
        String[] str = number.split("");
        
        for(String i: str) {
        	answer += Integer.parseInt(i);
        }
        
        answer = answer % 9;
        
        return answer;
    }
    
    //char 이용
//    public static int solution(String number) {
//        int answer = 0;
//
//        for(int i=0; i<number.length(); i++) {
//            answer += number.charAt(i) - '0';
//        }
//
//        answer %= 9;
//
//        return answer;
//    }
    
    //BigInteger 이용
//    public static int solution(String number) {
//        BigInteger x = new BigInteger(number);
//        BigInteger y = new BigInteger("9");
//        String ans = "";
//        ans += x.remainder(y);
//        int answer = Integer.parseInt(ans);
//        return answer;
//    }

}
