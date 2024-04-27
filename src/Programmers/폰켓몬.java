package programmers;

import java.util.HashSet;

public class 폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        int n = nums.length / 2;
        HashSet<Integer> numSet = new HashSet<>();
        
        for (int num : nums) numSet.add(num);
        
        if(numSet.size() > n) answer = n;
        else answer = numSet.size();
        
        return answer;
    }
    
    //다른사람 풀이
//	public static int solution(int[] nums) {
//		// 1. 기존 length를 구한다.
//		// 2. 중복값을 제거한 length를 구한다.
//		// 3. 두 값중 최소값이 정답.
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (!list.contains(nums[i])) {
//				list.add(nums[i]);
//			}
//		}
//
//		return nums.length / 2 > list.size() ? list.size() : nums.length / 2;
//	}
}
