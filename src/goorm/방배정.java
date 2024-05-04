package goorm;

import java.util.*;
import java.io.*;

public class 방배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			String str = "";
			
			if(s == 0) str += "여" + y;
			else str += "남" + y;
			
			if(map.containsKey(str)) map.replace(str, map.get(str) + 1);
			else map.put(str, 1);
		}
		br.close();
		
		int answer = 0;
		for (String s : map.keySet()) {
			int i  = map.get(s);
			if(i % k == 0) answer += i / k;
			else answer += i / k + 1;
		}
		
		System.out.println(answer);
	}
}
