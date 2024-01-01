package programmers;

import java.util.HashSet;

public class 삼각형의완성조건2 {

	public static void main(String[] args) {
		int[] sides = {3, 6};
		System.out.println(solution(sides));
	}
    public static int solution(int[] sides) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int A = sides[0] > sides[1]? sides[0] : sides[1]; //큰 수
        int B = sides[0] > sides[1]? sides[1] : sides[0]; //작은 수
        
        //i가 다른 두변의 길이 중 하나일 때
        for (int i = 1; i < A; i++) {
			if(i + B > A && !set.contains(i)) {
				set.add(i);
			}
		}
        
        //i가 가장 긴 변 일 때
        for (int i = A; i < A + B; i++) {
			int sum = A + B;
			if(i < sum && !set.contains(i)) {
				set.add(i);
			}
		}
        
        answer = set.size();
        
        return answer;
    }
    
    //다른사람의 코드
//    public static int solution(int[] sides) {
//        int answer = 0;
//        int max = Math.max(sides[0], sides[1]);
//        int min = Math.min(sides[0], sides[1]);
//
//        answer += min * 2 - 1;
//
//        return answer;
//    }
    
//    public static int solution(int[] sides) {
//        int answer = 0;
//
//        int max = sides[0] + sides[1] - 1;
//        int min = 0;
//
//        if (sides[0] > sides[1]) {
//            min = sides[0] - sides[1];
//        } else {
//            min = sides[1] - sides[0];
//        }
//
//        answer = max - min;
//        return answer;
//    }

}
