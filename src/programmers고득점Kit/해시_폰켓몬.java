package programmers고득점Kit;

import java.util.HashSet;

public class 해시_폰켓몬 {

	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		int answer = 0;
		
		int n  = nums.length / 2;
		
		HashSet<Integer> numSet = new HashSet<>();
		
		for (int num : nums) {
			numSet.add(num);
		}
		
		if(numSet.size() > n) {
			answer = n;
		} else {
			answer = numSet.size();
		}
		
		System.out.println(answer);
		
	}

}
