package programmers고득점Kit;

import java.util.Arrays;

public class 정렬_K번쨰수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		//풀어서 쓴 것
//		for (int a = 0; a < commands.length; a++) {
//			int i = commands[a][0];
//			int j = commands[a][1];
//			int k = commands[a][2];
//			
//			int[] arr = Arrays.copyOfRange(array, i - 1, j);
//			
//			Arrays.sort(arr);
//			answer[a] = arr[k - 1];
//		}
		
		//짧게
		for (int i = 0; i < commands.length; i++) {
			int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2] - 1];
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
