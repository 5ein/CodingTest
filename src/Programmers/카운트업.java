package programmers;

import java.util.Arrays;

public class 카운트업 {

	public static void main(String[] args) {
		int start_num = 3;
		int end_num = 10;
        int[] answer = new int[end_num - start_num + 1];
		
        int count = 0;
        for (int i = start_num; i <= end_num; i++) {
			answer[count] = i;
			count++;
		}
        
        System.out.println(Arrays.toString(answer));
	}

}
