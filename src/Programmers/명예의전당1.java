package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 명예의전당1 {

	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		System.out.println(Arrays.toString(solution(k, score)));
	}
	
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
			list.add(score[i]);
			Collections.sort(list);
			if(list.size() >= (k + 1)) {
				list.remove(0);
			}
			answer[i] = list.get(0);
		}
        
        return answer;
    }
    
    //다른사람의 풀이 queue 사용
//    public static int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        int temp = 0;
//        for(int i = 0; i < score.length; i++) {
//            priorityQueue.add(score[i]);
//            if (priorityQueue.size() > k) {
//                priorityQueue.poll();
//            }
//            answer[i] = priorityQueue.peek();
//        }
//        return answer;
//    }

}
