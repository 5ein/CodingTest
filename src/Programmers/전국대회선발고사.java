package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 전국대회선발고사 {

	public static void main(String[] args) {
		int[] rank = {3, 7, 2, 5, 4, 6, 1}; 
		boolean[] attendance = {false, true, true, true, true, false, false};
		
		System.out.println(solution(rank, attendance));
	}
	public static int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < rank.length; i++) {
			map.put(rank[i], i);
			if(attendance[i]) list.add(rank[i]);
		}
		Collections.sort(list);
		answer = 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));
		
		return answer;
	}
	
//    public static int solution(int[] rank, boolean[] attendance) {
//        int answer = 0;
//        int[][] list = new int[rank.length][2];
//        
//        for (int i = 0; i < rank.length; i++) {
//			list[i][0] = rank[i];
//			list[i][1] = i;
//		}
//        
//        Arrays.sort(list, (a, b) -> a[0] - b[0]);
//        
//        ArrayList<Integer> result = new ArrayList<>();
//        
//        for (int i = 0; i < attendance.length; i++) {
//            if (attendance[list[i][1]]) {
//                result.add(list[i][1]);
//            }
//            if (result.size() == 3) {
//                break;
//            }
//        }
//        
//        answer = 10000 * result.get(0) + 100 * result.get(1) + result.get(2);
//        
//        return answer;
//    }
	
	//다른사람 풀이
//    public static int solution(int[] rank, boolean[] attendance) {
//        TreeMap<Integer, Integer> tree = new TreeMap<>();
//        for (int i = 0; i < rank.length; i++) {
//            if (attendance[i] == true) tree.put(rank[i], i);
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (Integer key : tree.keySet()) {
//            if (list.size() == 3) break;
//            list.add(tree.get(key)); 
//        }
//        return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
//    }

}
