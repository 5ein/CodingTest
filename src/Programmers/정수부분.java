package programmers;

public class 정수부분 {

	public static void main(String[] args) {
		double flo = 1.42;
		System.out.println(solution(flo));
	}

    public static int solution(double flo) {
        int answer = 0;
        
        answer = (int)flo;
        
        return answer;
    }

}
