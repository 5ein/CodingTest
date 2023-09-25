package programmers;

import java.util.Arrays;

public class 리스트자르기 {

	public static void main(String[] args) {
//		int n = 3;
//		int[] slicer = {1, 5, 2};
//		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int n = 4;
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println(Arrays.toString(solution(n, slicer, num_list)));
	}
	
//    public static int[] solution(int n, int[] slicer, int[] num_list) {
//        int[] answer = {};
//        
//        if(n == 1) {
//        	answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
//        }else if (n == 2) {
//            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
//		}else if (n == 3) {
//			answer  = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
//		}else {
//            int startIndex = slicer[0];
//            int endIndex = slicer[1];
//            int step = slicer[2];
//            int length = ((endIndex - startIndex) / step) + 1;
//            answer = new int[length];
//            int index = 0;
//            for (int i = startIndex; i <= endIndex; i += step) {
//                answer[index++] = num_list[i];
//            }
//		}
//        
//        return answer;
//    }
    
    public static int[] solution(int n, int[] slicer, int[] num_list) {
    	int[] answer = {};
    	
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
    	
    	if(n == 1) {
    		answer = Arrays.copyOfRange(num_list, 0, b + 1);
    	}else if (n == 2) {
    		answer = Arrays.copyOfRange(num_list, a, num_list.length);
    	}else if (n == 3) {
    		answer  = Arrays.copyOfRange(num_list, a, b + 1);
    	}else {
    		int length = ((b - a) / c) + 1;
    		answer = new int[length];
    		int index = 0;
    		for (int i = a; i <= b; i += c) {
    			answer[index++] = num_list[i];
    		}
    	}
    	
    	return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(int n, int[] slicer, int[] num_list) {
//    	  int start = n == 1 ? 0 : slicer[0];
//        int end = n == 2 ? num_list.length - 1 : slicer[1];
//        int step = n == 4 ? slicer[2] : 1;
//        int[] answer = new int[(end - start) / step + 1];
//        for (int i = start, j = 0; i <= end; i += step) {
//            answer[j++] = num_list[i];
//        }
//        return answer;
//    }
}
