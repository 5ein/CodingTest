package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win = new ArrayList<>();
        for (int i : win_nums) {
			win.add(i);
		}
        List<Integer> my = new ArrayList<>();
        for (int i : lottos) {
			my.add(i);
		}
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int wincount = 0;
        int losecount = 0;
        for (int i = 0; i < my.size(); i++) {
			int n = my.get(i);
			if(n == 0) {
				wincount++;
			} else if(win.contains(n)) {
				wincount++;
				losecount++;
				win.remove(win.indexOf(n));
			}
		}
        
        int[] answer = {rank[wincount], rank[losecount]};
        
        return answer;
    }
    
    //풀이 1
//    public static int[] solution(int[] lottos, int[] win_nums) {
//        int[] rank = {6, 6, 5, 4, 3, 2, 1};
//        int answer = 0;
//        int hidden = 0;
//
//        Arrays.sort(win_nums);
//        for (int i = 0; i < lottos.length; i++)
//            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
//                answer++;
//            else if (lottos[i] == 0)
//                hidden++;
//
//        return new int[] {rank[answer + hidden], rank[answer]};
//    }
    
    //풀이 2
//    public static int[] solution(int[] lottos, int[] win_nums) {
//        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
//        int zeroCount = 0;
//
//        for(int lotto : lottos) {
//            if(lotto == 0) {
//                zeroCount++;
//                continue;
//            }
//            map.put(lotto, true);
//        }
//
//
//        int sameCount = 0;
//        for(int winNum : win_nums) {
//            if(map.containsKey(winNum)) sameCount++;
//        }
//
//        int maxRank = 7 - (sameCount + zeroCount);
//        int minRank = 7 - sameCount;
//        if(maxRank > 6) maxRank = 6;
//        if(minRank > 6) minRank = 6;
//
//        return new int[] {maxRank, minRank};
//    }
    
    //풀이 3
//    public static int[] solution(int[] lottos, int[] win_nums) {
//        // 순위에 따른 당첨 개수를 담은 배열
//        int[] rank = {6, 6, 5, 4, 3, 2, 1};
//        // 결과를 담을 배열, answer[0]: 최고 순위, answer[1]: 최저 순위
//        int[] answer = new int[2];
//        
//        for (int i = 0; i < lottos.length; i ++) {
//            if (lottos[i] == 0) {
//                // 0인 경우, 알 수 없는 번호로 간주하여 최고 순위 증가
//                answer[0]++;
//                continue;
//            }
//            for (int j = 0; j < win_nums.length; j++) {
//                if (lottos[i] == win_nums[j]) {
//                    // 일치하는 번호가 있으면 최고 순위와 최저 순위 모두 증가
//                    answer[0]++;
//                    answer[1]++;
//                }
//            }
//        }
//        
//        // 순위에 따른 등수로 변환
//        answer[0] = rank[answer[0]];
//        answer[1] = rank[answer[1]];
//        
//        return answer;
//    }

}
