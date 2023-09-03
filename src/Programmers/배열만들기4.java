package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기4 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 3};
		
		int i = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while (i < arr.length) {
			if(list.size() == 0) { //list.isEmpty()
				list.add(arr[i]);
				i++;
			}else if(list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
				i++;
			}else if(list.get(list.size() - 1) >= arr[i]) {
				list.remove(list.size() - 1);
			}
		}
		
        int[] stk = new int[list.size()];
        for (int j = 0; j < stk.length; j++) {
			stk[j] = list.get(j);
		}
		
		System.out.println(Arrays.toString(stk));
		
	}

}
