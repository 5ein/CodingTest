package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//방법 1
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int[] dot1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
//		st = new StringTokenizer(br.readLine());
//		int[] dot2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
//		st = new StringTokenizer(br.readLine());
//		int[] dot3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
//		br.close();
//
//		int x;
//		int y;
//		
//		//x 찾기
//		if(dot1[0] == dot2[0]) x = dot3[0];
//		else if(dot1[0] == dot3[0]) x = dot2[0];
//		else x = dot1[0];
//		
//		//y 찾기
//		if(dot1[1] == dot2[1]) y = dot3[1];
//		else if(dot1[1] == dot3[1]) y = dot2[1];
//		else y = dot1[1];
		
		//방법 2
//		StringTokenizer st;
//		int[] dotx = new int[3];
//		int[] doty = new int[3];
//		
//		for (int i = 0; i < 3; i++) {
//			st = new StringTokenizer(br.readLine());
//			dotx[i] = Integer.parseInt(st.nextToken());
//			doty[i] = Integer.parseInt(st.nextToken());
//		}
//		br.close();
//		
//		int x, y;
//		
//		//x 찾기
//		if(dotx[0] == dotx[1]) x = dotx[2];
//		else if(dotx[0] == dotx[2]) x = dotx[1];
//		else x = dotx[0];
//		
//		//y 찾기
//		if(doty[0] == doty[1]) y = doty[2];
//		else if(doty[0] == doty[2]) y = doty[1];
//		else y = doty[0];
		
		//방법 3 hashMap 이용
		StringTokenizer st;
		HashMap<Integer, Integer> X = new HashMap<>();
		HashMap<Integer, Integer> Y = new HashMap<>();
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			X.put(x, X.getOrDefault(x, 0) + 1);
			Y.put(y, Y.getOrDefault(y, 0) + 1);
		}
		br.close();
		
		int x = 0;
		int y = 0;
		for (int a : X.keySet()) {
			if(X.get(a) == 1) x = a;
		}

		for (int b : Y.keySet()) {
			if(Y.get(b) == 1) y = b;
		}
		
		//출력부분
		System.out.println(x + " " + y);
	}
}
