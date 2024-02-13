package programmers;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		System.out.println(solution(left, right));
	}
	
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j * j <= i; j++) {
				if(j * j == i) count++;
				else if(i % j == 0) count += 2;
			}
			if(count % 2 == 0) answer += i;
			else answer -= i;
		}
        return answer;
    }
    
    //다른사람의 풀이 (제곱수인지 아닌지를 통해 약수의 갯수를 알수 있음)
    // 제곱수이면 약수는 홀수개
    // 제곱수가 아니면 약수는 짝수개
//    public static int solution(int left, int right) {
//        int answer = 0;
//        for (int i = left; i <= right; i++) {
//            if (i % Math.sqrt(i) == 0) { //제곱수인 경우 약수의 개수가 홀수
//                answer -= i;
//            }
//            else { //제곱수가 아닌 경우 약수의 개수가 짝수
//                answer += i;
//            }
//        }
//        return answer;
//    }

}
