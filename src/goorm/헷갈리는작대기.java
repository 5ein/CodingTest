package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 헷갈리는작대기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		String[] arr = str.split("");
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 0); map.put("I", 0); map.put("l", 0); map.put("|", 0);
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			if(map.containsKey(s)) map.replace(s, map.get(s) + 1);
		}
		for (String s : map.keySet()) {
			System.out.println(map.get(s));
		}
	}
}
