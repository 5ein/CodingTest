package programmers;

public class 합성수찾기 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
    public static int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				count += (i % j == 0) ? 1 : 0;
			}
			answer += (count >= 3) ? 1 : 0;
		}
        
        return answer;
    }
    
//    public static int solution(int n) {
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            int cnt = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) cnt++;
//            }
//            if (cnt >= 3) answer++;
//        }
//
//        return answer;
//    }

}
