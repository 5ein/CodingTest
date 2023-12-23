package goorm;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		int n = 144;
		System.out.println(solution(n));
	}
    public static int solution(int n) {
        int answer = 2;
        for (int i = 1; i < n / 4; i++) {
			if(i * i == n) {
				answer = 1;
				break;
			}
		}
        return answer;
    }

}
