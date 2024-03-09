package programmers;

public class 소수찾기 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
    	for (int i = 2; i < n + 1; i++) {
    		if(isPrime(i)) answer++;
		}
        return answer;
    }
    
    public static boolean isPrime(int n) {
    	for (int i = 2; i * i <= n; i++) { //제곱근으로 안돌리면 시간초과남
			if(n % i == 0) return false;
		}
    	return true;
    }
    
    //다른사람 풀이
//    public static int isPrime(int n) {
//        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
//          if (n % i == 0) {
//              return 0;
//          }
//        }
//        return 1;
//    }
//    public static int solution(int n) {
//        int answer = 0;
//        for(int i = 2; i <= n; i++) {
//            if(isPrime(i)==1) {
//                ++answer;
//            }
//        }
//        return answer;
//    }
}
