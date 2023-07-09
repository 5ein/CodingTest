package programmers;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		int[] answer = new int[emergency.length];
		
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if(emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
