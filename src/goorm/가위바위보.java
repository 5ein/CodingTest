package goorm;

import java.util.*;
import java.io.*;

public class 가위바위보 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("1", 0); map.put("2", 0); map.put("3", 0);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			String s = st.nextToken();
			map.replace(s, map.get(s) + 1);
		}
		br.close();
		
		String answer = "";
		if(map.get("1") > 0 && map.get("2") > 0 && map.get("3") > 0) {
			answer = "0";
		} else if(map.get("1") == 5 || map.get("2") == 5 || map.get("3") == 5) {
			answer = "0";
		} else {
			for (String s : map.keySet()) if(map.get(s) == 0) answer = s;
			if(answer.equals("1")) answer = map.get("3") + "";
			else if(answer.equals("2")) answer = map.get("1") + "";
			else answer = map.get("2") + "";
		}
		
		System.out.println(answer);
	}

}
