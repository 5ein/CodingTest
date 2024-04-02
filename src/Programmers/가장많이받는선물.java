package programmers;

import java.util.HashMap;

public class 가장많이받는선물 {

	public static void main(String[] args) {
		String[] friends = { "muzi", "ryan", "frodo", "neo" };
		String[] gifts = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
				"frodo ryan", "neo muzi" };
		System.out.println(solution(friends, gifts));
	}

	public static int solution(String[] friends, String[] gifts) {
		int answer = 0;
		int friendsLenght = friends.length;
		HashMap<String, Integer> dic = new HashMap<>();
		int[] giftDegree = new int[friendsLenght];
		int[][] giftGraph = new int[friendsLenght][friendsLenght];

		for (int i = 0; i < friendsLenght; i++) {
			dic.put(friends[i], i);
		}

		for (String gift : gifts) {
			String[] giftName = gift.split(" ");
			giftDegree[dic.get(giftName[0])]++;
			giftDegree[dic.get(giftName[1])]--;
			giftGraph[dic.get(giftName[0])][dic.get(giftName[1])]++;
		}

		for (int i = 0; i < friendsLenght; i++) {
			int num = 0;
			for (int j = 0; j < friendsLenght; j++) {
				if (i == j) continue;

				if (giftGraph[i][j] > giftGraph[j][i]
						|| (giftGraph[i][j] == giftGraph[j][i] 
								&& giftDegree[i] > giftDegree[j])) {
					num++;
				}
			}//for

			if (answer < num) answer = num;
		}

		return answer;
	}
	
	//다른 사람 풀이1
//	public static int solution(String[] friends, String[] gifts) {
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < friends.length; i++) {
//            map.put(friends[i], i);
//        }
//        int[] index = new int[friends.length];
//        int[][] record = new int[friends.length][friends.length];
//
//        for (String str : gifts) {
//            String[] cur = str.split(" ");
//            index[map.get(cur[0])]++;
//            index[map.get(cur[1])]--;
//            record[map.get(cur[0])][map.get(cur[1])]++;
//        }
//
//       int ans = 0;
//       for (int i = 0; i < friends.length; i++) {
//           int cnt = 0;
//           for (int j = 0; j < friends.length; j++) {
//               if(i == j) continue;
//               if (record[i][j] > record[j][i]) cnt++;
//               else if (record[i][j] == record[j][i] && index[i] > index[j]) cnt++; 
//           }
//           ans = Math.max(cnt, ans);
//       }
//        return ans;
//    }

}
