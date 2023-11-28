package programmers;

public class 특별한이차원배열1 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	
//    public static int[][] solution(int n) {
//        int[][] answer = new int[n][n];
//        for (int i = 0; i < answer.length; i++) {
//        	answer[i][i] = 1;
//			for (int j = 0; j < answer[i].length; j++) {
//				if(answer[i][j] != 1) {
//					answer[i][j] = 0;
//				}
//			}
//		}
//        return answer;
//    }
    
    public static int[][] solution(int n) {
    	int[][] answer = new int[n][n];
    	for (int i = 0; i < answer.length; i++) {
    		answer[i][i] = 1;
    	}
    	return answer;
    }
}
