package programmers;

public class 두정수사이의합 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println(solution(a, b));
	}
	
//    public static long solution(int a, int b) {
//        long answer = 0;
//        int min = a > b ? b : a;
//        int max = a > b ? a : b;
//        for (int i = min; i <= max; i++) {
//			answer += i;
//		}
//        return answer;
//    }

	public static long solution(int a, int b) {
		long answer = 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		answer = (max - min + 1) * (max + min) / 2; //등차수열[n * (a1 + an) / 2]
		return answer;
	}
	
}
