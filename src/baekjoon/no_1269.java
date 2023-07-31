package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class no_1269 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		HashMap<Integer, Integer> AB = new HashMap<>();
//		HashMap<Integer, Integer> BA = new HashMap<>();
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < n; i++) {
//			int key = Integer.parseInt(st.nextToken());
//			AB.put(key, AB.getOrDefault(key, 0) + 1);
//			BA.put(key, BA.getOrDefault(key, 0) - 1);
//		}
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < m; i++) {
//			int key = Integer.parseInt(st.nextToken());
//			AB.put(key, AB.getOrDefault(key, 0) - 1); //0보다 커야함
//			BA.put(key, BA.getOrDefault(key, 0) + 1); //0보다 커야함
//		}
//		br.close();
//		
//		int count = 0;
//		for (Integer key : AB.keySet()) {
//			//System.out.println(key + ", " + AB.get(key));
//			if(AB.get(key) > 0) count++;
//		}
//		for (Integer key : BA.keySet()) {
//			//System.out.println(key + ", " + BA.get(key));
//			if(BA.get(key) > 0) count++;
//		}
//		
//		System.out.println(count);
//	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		int element = -1;
		
		HashSet<Integer> setA = new HashSet<>(aSize);
		HashSet<Integer> setB = new HashSet<>(bSize);
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < aSize; i++) {
			element = Integer.parseInt(st.nextToken());
			setA.add(element);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < bSize; i++) {
			element = Integer.parseInt(st.nextToken());
			
			if(setA.contains(element)) {
				setA.remove(element);
			} else {
				setB.add(element);
			}
		}
		
		bw.write(String.valueOf(setA.size() + setB.size()));
		br.close();
		bw.close();
	}

}
