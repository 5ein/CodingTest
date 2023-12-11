package programmers;

public class 가까운수 {

	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		System.out.println(solution(array, n));
	}
	
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int abs = Math.abs(array[0] - n);
        for (int i = 1; i < array.length; i++) {
			int abs2 = Math.abs(array[i] - n);
        	if(abs2 < abs) {
        		answer = array[i];
        		abs = abs2;
        	}else if(abs == abs2) {
        		answer = Math.min(answer, array[i]);
        		abs = Math.abs(answer - n);
        	}
		}
        return answer;
    }

}
