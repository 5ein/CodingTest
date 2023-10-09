package programmers;

import java.util.Arrays;

public class 수열과구간쿼리1 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
		System.out.println(Arrays.toString(solution(arr, queries)));
	}
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				answer[j]++;
			}
		}
        return answer;
    }
    
    //다른사람의 풀이
//    public static int[] solution(int[] arr, int[][] queries) {
//        for (int[] query : queries) {
//            for (int j = query[0]; j <= query[1]; j++) {
//                arr[j]++;
//            }
//        }
//
//        return arr;
//    }

}
