package programmers고득점Kit;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;

public class 스택큐_기능개발 {
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] works = new int[progresses.length];
		
		for (int i = 0; i < works.length; i++) {
			works[i]  = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0){
                works[i]  += 1;
            }
		}
		
		int x = works[0];
		int count = 1;
		for (int i = 1; i < works.length; i++) {
			if(x >= works[i]) {
				count++;
			}else {
				list.add(count);
				count = 1;
				x = works[i];
			}
		}
		list.add(count);
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	//큐를 이용한 방법
//	public static void main(String[] args) {
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
//		
//		ArrayList<Integer> list = new ArrayList<>();
//        Queue<Integer> q = new LinkedList<>();
//
//        for (int i = 0; i < progresses.length; i++) {
//            if ((100 - progresses[i]) % speeds[i] == 0) {
//                q.add((100 - progresses[i]) / speeds[i]);
//            } else {
//                q.add((100 - progresses[i]) / speeds[i] + 1);
//            }
//        }
//
//        int x = q.poll();
//        int count = 1;
//        while (!q.isEmpty()) {
//            if (x >= q.peek()) {
//                count++;
//                q.poll();
//            } else {
//                list.add(count);
//                count = 1;
//                x = q.poll();
//            }
//        }
//        list.add(count);
//
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//		
//		System.out.println(Arrays.toString(answer));
//	}
}