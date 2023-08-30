package programmers;

import java.util.Arrays;

public class 수열과구간쿼리 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
		
		int[] answer = {};
		
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(j % queries[i][2] == 0) arr[j]++;
			}
		}
		
		answer = arr;
		
		System.out.println(Arrays.toString(answer));
		
	}

}
