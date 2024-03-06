package programmers;

import java.util.Arrays;

public class 과일장수 {

	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(k, m, score));
	}
	
	public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m;
        return answer;
    }
	
//    public static int solution(int k, int m, int[] score) {
//        int answer = 0;
//        Arrays.sort(score);
//        for (int i = score.length; i >= m; i-= m) {
//			answer += score[i - m] * m;
//		}
//        return answer;
//    }
    
//    public static int solution(int k, int m, int[] score) {
//        int answer = 0; 
//        int boxNum = score.length / m;
//        Arrays.sort(score);
//        
//        if(score.length % m == 0) {
//            for(int i = 0; i < boxNum; i++) {
//                answer += (score[i * m]) * m * 1;
//            }
//        } else {
//            int rest = score.length % m;
//            for(int i = 0; i < boxNum; i++) {
//                answer += (score[rest + (i * m)]) * m * 1;
//            }
//        }
//        
//        return answer;
//    }

}
