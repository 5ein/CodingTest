package programmers;

public class 세균증식 {

	public static void main(String[] args) {
		int n = 2;
		int t = 10;
			
		System.out.println(solution(n, t));
	}
	
    public static int solution(int n, int t) {
        int answer = 0;
        
        answer = n * (int)(Math.pow(2, t));
        
        return answer;
    }
    
    //비트연산 방법: 한칸씩 밀면 2를 곱한것과 같은거니까 t만큼 밀어주면 정답
//    public static int solution(int n, int t) {
//        int answer = 0;
//
//        answer = n << t;
//
//        return answer;
//    }
    
    
}
