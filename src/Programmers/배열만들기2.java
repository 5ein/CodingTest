package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기2 {

	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = l; i <= r; i++) {
			String str = i + "";
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 48 || str.charAt(j) == 53) {
					count ++;
				}
			}
			if(count == str.length()) {
				list.add(i);
			}
		}
		
		if(list.size() != 0) {
			int[] answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			System.out.println(Arrays.toString(answer));
		} else {
			int[] answer = {-1};
			System.out.println(Arrays.toString(answer));
		}
	}
}
