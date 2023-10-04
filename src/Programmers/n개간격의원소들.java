package programmers;

import java.util.Arrays;

public class n개간격의원소들 {

	public static void main(String[] args) {
//		int[] num_list = {4, 2, 6, 1, 7, 6};
//		int n = 2;
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 4;
		
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        answer = new int[(num_list.length - 1) / n + 1];
        for (int i = 0, j = 0; i < num_list.length; i += n) {
			answer[j++] = num_list[i];
		}
        
        return answer;
    }
    
    //다른사람의 풀이
//    public static int[] solution(int[] num_list, int n) {
//        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
//        int idx = 0;
//        int[] answer = new int[N];
//        for (int i = 0;i < num_list.length;i+=n)
//            answer[idx++] = num_list[i];
//        return answer;
//    }
    
//    public static int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = num_list[i * n];
//        }
//        return answer;
//    }
    
//    public static int[] solution(int[] num_list, int n) {
//
//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0; i < num_list.length;) {
//            list.add(num_list[i]);
//            i+=n;
//        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
    
}
