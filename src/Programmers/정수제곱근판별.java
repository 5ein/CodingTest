package programmers;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		long n = 121;
		System.out.println(solution(n));
	}
	
	//Math.sqrt(n) = n의 제곱근
	//Math.pow(a, b) = a의 b제곱 (a의 b승)
    public static long solution(long n) {
        long answer = -1;
        Double x = Math.sqrt(n);
        if(x == x.longValue()) {
        	answer = (long)Math.pow(x + 1, 2);
        }
        return answer;
    }

}
