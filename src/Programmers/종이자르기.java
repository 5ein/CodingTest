package programmers;

public class 종이자르기 {

	public static void main(String[] args) {
		int M = 2;
		int N = 5;
		System.out.println(solution(M, N));
	}
	
    public static int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }

}
