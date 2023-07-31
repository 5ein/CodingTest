package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_1764 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashMap<String, Integer> map = new HashMap<>();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		for (int i = 0; i < n; i++) {
//			String noH = br.readLine();
//			if (map.containsKey(noH)) map.put(noH, map.get(noH) + 1);
//			else map.put(noH, 1);
//		}
//		
//		for (int i = 0; i < m; i++) {
//			String noS = br.readLine();
//			if(map.containsKey(noS)) map.put(noS, map.get(noS) + 1);
//			else map.put(noS, 1);
//		}
//		br.close();
//		
//		ArrayList<String> list = new ArrayList<String>();
//		int count = 0;
//		
//		for (String key : map.keySet()) {
//			if(map.get(key) == 2) {
//				list.add(key);
//				count++;
//			}
//		}
//		
//		Collections.sort(list);
//		
//		System.out.println(count);
//		for (int i = 0; i < count; i++) {
//			System.out.println(list.get(i));
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			String noH = br.readLine();
			if (map.containsKey(noH)) map.put(noH, map.get(noH) + 1);
			else map.put(noH, 1);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			String noS = br.readLine();
			if(map.containsKey(noS)) list.add(noS);
		}
		br.close();
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
