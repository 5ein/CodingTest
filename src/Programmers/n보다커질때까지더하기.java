package programmers;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		System.out.println(solution(numbers, n));
	}
	
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int i : numbers) {
			answer += i;
			if(answer > n) break;
		}
        
        return answer;
    }
    
    //다른사람의 풀이
//    public static int solution(int[] numbers, int n) {
//        int answer = 0;
//
//        for(int i = 0; answer <= n; i++) {
//            answer += numbers[i];
//        }
//
//        return answer;
//    }
}
