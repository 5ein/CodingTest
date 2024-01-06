package programmers;

public class 유한소수판별하기 {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		System.out.println(solution(a, b));
	}
	
    public static int solution(int a, int b) {
        int answer = 0;
        while (b % 2 == 0 || b % 5 == 0) {
			if(b % 2 == 0) b /= 2;
			if(b % 5 == 0) b /= 5;
		}
        answer = (a % b == 0)? 1 : 2;
        return answer;
    }
    
    
    //다른 풀이
//    public static int solution(int a, int b) {
//        int newB = b / gcd(a, b);
//
//        while (newB != 1) {
//            if (newB % 2 == 0) {
//                newB /= 2;
//            } else if (newB % 5 == 0) {
//                newB /= 5;
//            } else {
//                return 2;
//            }
//        }
//
//        return 1;
//    }
//    private static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return gcd(b, a % b);
//        }
//    }

}
