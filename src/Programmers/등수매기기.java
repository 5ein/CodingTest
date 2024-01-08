package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 등수매기기 {

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		System.out.println(Arrays.toString(solution(score)));
	}
	
    public static int[] solution(int[][] score) {
    	List<Integer> scoreList = new ArrayList<>();
    	for (int[] i : score) {
			scoreList.add(i[0] + i[1]);
		}
    	
    	//System.out.println(scoreList.toString());
    	scoreList.sort(Comparator.reverseOrder()); //내림차순
    	//System.out.println(scoreList.toString());
    	
    	int[] answer = new int[score.length];
    	for (int i = 0; i < score.length; i++) {
    		answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
		}
        return answer;
    }
    
    // 다른사람 풀이
//    public int[] solution(int[][] score) {
//        int[] answer = new int[score.length];
//        float[] average = new float[score.length];
//        for (int idx = 0; idx < score.length; idx++) {
//            float ave = (float) (score[idx][1] + score[idx][0]) / 2f; // 평균값
//            average[idx] = ave; // 평균값 배열
//        }
//
//        Arrays.sort(average); // 평균배열의 내림차순
//        int rank = 0;
//        int chkCount = 0;
//        int[] grades = new int[average.length];
//        Map<Float, Integer> averageMap = new HashMap<Float, Integer>();
//        for (int idx = average.length - 1; idx >= 0; idx--) {
//            float grade = average[idx];
//            if (averageMap.containsKey(grade)) {
//                chkCount++;
//            } else {
//                rank += chkCount + 1;
//                chkCount = 0;
//            }
//            averageMap.put(grade, rank);
//        }
//        for (int idx = 0; idx < score.length; idx++) {
//            float ave = (float) (score[idx][1] + score[idx][0]) / 2f; // 평균값
//            answer[idx] = averageMap.get(ave); // 평균값 랭크
//        }
//        return answer;
//    }
    
//    public int[] solution(int[][] score) {
//        double[] map = new double[score.length];
//      int[] result= new int[score.length];
//      for (int i = 0; i <score.length ; i++) {
//        map[i] = (score[i][0]+ score[i][1])/2.0;
//      }
//
//      for (int i = 0; i <score.length ; i++) {
//        int count =0;
//        for (int j = 0; j <score.length ; j++) {
//          if(map[i] < map[j]){
//            count++;
//          }
//        }
//        result[i] = count+1;
//      }
//
//      return result;
//    }

}
