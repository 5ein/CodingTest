package programmers;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int[] arr) {
        int[] answer = {};
        
       //pow(2, 3) = 2의3제급
        int pow = 0;
        while (arr.length > Math.pow(2, pow)) {
			pow++;
		}
        answer = new int[(int)Math.pow(2, pow)];
        for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		} //0을 따로 추가하지 않아도 answer를 다시 설정했을때 이미 0이 채워져있는 상태임
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int[] arr) {
//        int length = 1;
//
//        while (length < arr.length) {
//            length *= 2;
//        }
//
//        return Arrays.copyOf(arr, length);
//    }
    
//    public static int[] solution(int[] arr) {
//
//        int len = arr.length;
//        int tmp = 1;
//
//        while (tmp < len) {
//            tmp *= 2;
//        }
//
//        int[] answer = new int[tmp];
//
//        for (int i = 0; i < arr.length; i++) {
//            answer[i] = arr[i];
//        }
//
//        return answer;
//    }

}
