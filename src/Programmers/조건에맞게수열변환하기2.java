package programmers;

import java.util.Arrays;

public class 조건에맞게수열변환하기2 {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		System.out.println(solution(arr));
	}
	
//    public static int solution(int[] arr) {
//    	int answer = 0;
//        int count = 0;
//        int[] beforArr = new int[arr.length];
//        while(count != arr.length) {
//            count = 0;
//            beforArr = arr.clone();
//            for(int i =0; i<arr.length; i++) {
//            if(arr[i]%2 == 0 && arr[i] >= 50) {
//                arr[i] /= 2;
//            }else if(arr[i]%2 != 0 && arr[i] < 50) {
//                arr[i] = arr[i]*2 +1;
//            }
//            if(arr[i] == beforArr[i] ) count ++;
//        }
//            answer ++;
//        }
//        
//        return answer-1;
//    }
    public static int solution(int[] arr) {
    	int answer = -1;
	    int[] be = arr.clone();
	    int[] af = new int[be.length];

	    while (true) {
	        for (int i = 0; i < be.length; i++) {
	            if (be[i] >= 50 && be[i] % 2 == 0) {
	                af[i] = be[i] / 2;
	            } else if (be[i] < 50 && be[i] % 2 != 0) {
	                af[i] = be[i] * 2 + 1;
	            } else {
	                af[i] = be[i]; // 50보다 큰 짝수와 50보다 작은 홀수가 아닌 경우에는 값이 변하지 않아야 합니다.
	            }
	        }
	        answer++;
	        if(Arrays.equals(be, af)) break;
	        else {
	        	be = af.clone(); // af 배열의 값을 be 배열로 복사
	        	af = new int[be.length];
	        }
	    }

	    return answer;
    }
}
