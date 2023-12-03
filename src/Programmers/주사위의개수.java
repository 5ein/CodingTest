package programmers;

public class 주사위의개수 {

	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
		
		System.out.println(solution(box, n));
	}
    public static int solution(int[] box, int n) {
        int answer = 0;
        
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        
        return answer;
    }

}
