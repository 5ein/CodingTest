package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_10816 {
	//시간초과
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int n = Integer.parseInt(sc.nextLine());
//		
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < n; i++) {
//			int num = sc.nextInt();
//			
//			map.put(num, map.getOrDefault(num, 0) + 1);
//		}
//		sc.nextLine();
//		
//		int m = Integer.parseInt(sc.nextLine());
//		
//		for (int i = 0; i < m; i++) {
//			int num = sc.nextInt();
//			int key;
//			try {
//				key = map.get(num);
//				sb.append(key + " ");
//			} catch (Exception e) {
//				sb.append(0 + " ");
//			}
//		}
//		sc.close();
//		
//		System.out.println(sb.toString());
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (map.get(num) == null) map.put(num, 1);
			else map.put(num, map.get(num) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(map.get(num) == null) sb.append(0).append(" ");
			else sb.append(map.get(num)).append(" ");
		}
		br.close();;
		
		System.out.println(sb);
	}

}
