package programmers고득점Kit;

import java.util.ArrayList;
import java.util.Arrays;

public class 완전탐색_모의고사 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		int[] A = {1, 2, 3, 4, 5}; //5개 반복
		int[] B = {2, 1, 2, 3, 2, 4, 2, 5}; //8개 반복
		int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10개 반복
		int as = 0, bs = 0, cs = 0; //a점수 b점수 c점수
		
		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == A[i % 5]) as++;
			if(answers[i] == B[i % 8]) bs++;
			if(answers[i] == C[i % 10]) cs++;
		}
		
		int max = Math.max(Math.max(as, bs), cs);
		
		ArrayList<Integer> list = new ArrayList<>();
		if (as == max) list.add(1);
		if (bs == max) list.add(2);
		if (cs == max) list.add(3);
		
		int[] answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		//다른 사람 풀이
//		int[][] patterns = {
//                {1, 2, 3, 4, 5},
//                {2, 1, 2, 3, 2, 4, 2, 5},
//                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
//        };
//
//        int[] hit = new int[3];
//        for(int i = 0; i < hit.length; i++) {
//            for(int j = 0; j < answers.length; j++) {
//                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
//            }
//        }
//
//        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < hit.length; i++)
//            if(max == hit[i]) list.add(i + 1);
//
//        int[] answer = new int[list.size()];
//        int cnt = 0;
//        for(int num : list)
//            answer[cnt++] = num;
//		
//        System.out.println(Arrays.toString(answer));
	}

}
