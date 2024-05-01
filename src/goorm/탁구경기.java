package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 탁구경기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		map.put("D", 0); map.put("P", 0);
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if(s.equals("D")) map.replace("D", map.get("D") + 1);
			else map.replace("P", map.get("P") + 1);
			
			if(Math.abs(Math.abs(map.get("D")) - Math.abs(map.get("P"))) >= 2) break;
		}
		System.out.println(map.get("D") + ":" + map.get("P"));
	}

}
