package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		System.out.println(Arrays.toString(solution(players, callings)));
	}
	
	public static String[] solution(String[] players, String[] callings) {
		String[] answer = players;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < answer.length; i++) {
			String player = answer[i];
			map.put(player, i);
		}
		
		for (String c : callings) {
			int rank = map.get(c);
			
			String forwardC = answer[rank - 1];
			
			answer[rank - 1] = c;
			map.replace(c, rank - 1);
			
			answer[rank] = forwardC;
			map.replace(forwardC, rank);
		}
		
		return answer;
	}
	/* 
	 - Map의 replace 와 put 차이
		replace는 키가 이미 존재할 경우에만 값을 대체할 경우 사용.
		put은 맵에 추가하거나, 이미 존재하는 키의 값을 무조건 대체하려는 경우 사용.
	*/
	
	//다른사람 풀이1
//    public static String[] solution(String[] players, String[] callings) {
//        String[] answer = {};
//        
//        Map<String, Integer> ranking = new HashMap<>();
//        for (int i = 0; i < players.length; i++) {
//        	ranking.put(players[i], i);
//		}
//        
//        for (String player : callings) {
//			int playerRanking = ranking.get(player); //추월한 플레이어의 랭킹
//			
//			String frontPlayer = getKey(ranking, playerRanking - 1); //추월당한 플레이어 찾기
//			
//			ranking.replace(frontPlayer, playerRanking); //추월당한 플레이어 랭킹 변경
//			
//			ranking.replace(player, playerRanking - 1); //추월한 플레이어 랭킹 변경
//		}
//        
//        answer = new String[players.length];
//        for (Entry<String, Integer> entrySet : ranking.entrySet()) {
//			answer[entrySet.getValue()] = entrySet.getKey();
//		}
//        
//        return answer;
//    }
//    
//    public static <K, V> K getKey(Map<K, V> map, V value) {
//    	
//    	for (K key : map.keySet()) {
//			if(value.equals(map.get(key))) return key;
//		}
//    	
//    	return null;
//    }
	
	//다른사람풀이 2
//	public static String[] solution(String[] players, String[] callings) {
//		String[] answer = new String[players.length];
//		
//		HashMap<String, Integer> player = new HashMap<>();
//		HashMap<Integer, String> rank = new HashMap<>();
//		
//		for (int i = 0; i < players.length; i++) {
//			player.put(players[i], i);
//			rank.put(i, players[i]);
//		}
//		
//		for (String call : callings) {
//			int callRank = player.get(call); //추월한 유저 순위
//			String callPlayer = rank.get(callRank); //추월한 유저 이름
//			
//			String frontPlayer = rank.get(callRank - 1); //추월당한 유저 이름
//			
//			//swap
//			player.put(callPlayer, callRank - 1);
//			player.put(frontPlayer, callRank);
//			
//			rank.put(callRank - 1, callPlayer);
//			rank.put(callRank, frontPlayer);
//		}
//		
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = rank.get(i);
//		}
//		
//		return answer;
//	}

}
