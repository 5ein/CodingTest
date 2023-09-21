package programmers;

import java.util.Arrays;

public class 배열만들기 {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		System.out.println(Arrays.toString(solution(n, k)));
		// {3, 6, 9}
	}

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        int idx = 0;
        for (int i = 1; i <= n; i++) {
			if(i % k == 0) {
				answer[idx++] = i;
			}
		}
        
        return answer;
    }
    
    // 다른사람 풀이 1
//    public static int[] solution(int n, int k) {
//        int count = n / k;
//
//
//        int[] answer = new int[count];
//
//        for (int i = 1; i <= count; i++) {
//            answer[i - 1] = k * i;
//        }
//
//        return answer;
//    }
    
    // 다른사람 풀이 2
//    public static int[] solution(int n, int k) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=k; i<=n; i+=k) list.add(i);
//
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
    
}
