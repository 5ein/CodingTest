package programmers고득점Kit;

import java.util.HashMap;

public class 해시_완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
	    String answer = "";
		
	    HashMap<String, Integer> map = new HashMap<>();
	    
	    for (String key : participant) {
			map.put(key, map.getOrDefault(key, 0) + 1); //이미 HashMap에 저장되어 있다면 그 값을 가져오고, 없다면 기본값으로 0을 사용하여 1을 더한 값을 저장하는 역할
		}
	    for (String key : completion) {
			map.put(key, map.get(key) - 1);
		}
	    
	    for (String key : map.keySet()) {
			if(map.get(key) != 0) answer += key;
		}
		
	    System.out.println(answer);
	}

}
