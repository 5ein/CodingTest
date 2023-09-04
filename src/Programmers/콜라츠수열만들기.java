package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 콜라츠수열만들기 {

	public static void main(String[] args) {
		int n = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(n);
		
		while (n != 1) {
			if(n % 2 == 0) {
				n /= 2;
				list.add(n);
			}else {
				n = 3 * n + 1;
				list.add(n);
			}
		}
		
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
        System.out.println(Arrays.toString(answer));
	}

}
