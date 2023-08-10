package programmers고득점Kit;

import java.util.HashMap;

public class 해시_의상 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int answer = 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//안입는 경우도 포함
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
		}
		
		for (Integer v : map.values()) {
			answer *= v;
		}
		
		System.out.println(answer - 1); //아무것도 안입는 경우를 뻄
	}

}
