package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 다이어트 {
	
	//정답
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken()); 
			int e = Integer.parseInt(st.nextToken()); 
			if(c > e) W++;
			else if(c < e) W--;
			
			if(W > 80) W--;
			else if(W < 10) W++;
		}
		br.close();
		System.out.println(W);
	}
	
	//틀린답1
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int W = Integer.parseInt(st.nextToken());
//		int N = Integer.parseInt(st.nextToken());
//		for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine());
//			int c = Integer.parseInt(st.nextToken()); 
//			int e = Integer.parseInt(st.nextToken()); 
//			if(W < 80 && W > 10) {
//				if(c > e) W++;
//				else if(c < e) W--;
//			}
//		}
//		br.close();
//		System.out.println(W);
//	}
		
		//틀린답2
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int W = Integer.parseInt(st.nextToken());
//		int N = Integer.parseInt(st.nextToken());
//		for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine());
//			int c = Integer.parseInt(st.nextToken()); 
//			int e = Integer.parseInt(st.nextToken()); 
//			if(W >= 80 || W <= 10) continue;
//			
//			if(c > e) W++;
//			else if(c < e) W--;
//		}
//		br.close();
//		System.out.println(W);
//	}
		
}
