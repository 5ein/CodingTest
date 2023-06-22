package programmers;

import java.util.Arrays;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = new int[2];
		
		for(int x: num_list) {
			if(x != 0) {
				if(x % 2 == 0) answer[0]++;
				else answer[1]++;
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
