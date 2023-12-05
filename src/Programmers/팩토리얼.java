package programmers;

public class 팩토리얼 {

	public static void main(String[] args) {
		int n = 3628800;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
			factorial *= i;
			if(factorial <= n) {
				answer = i;
			} else {
				break;
			}
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(int n) {
//        int answer = 1;
//        int factorial = 1;
//
//        while(n >= factorial) {
//            answer ++;
//            factorial *= answer;
//        }
//        return answer -1 ;
//    }

}
