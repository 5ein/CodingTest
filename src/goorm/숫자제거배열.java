package goorm;

import java.io.*;
import java.util.StringTokenizer;

public class 숫자제거배열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		String k = st.nextToken();
		
		int count = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			String str = st.nextToken();
			if (!str.contains(k)) count++;
		}
		
		System.out.println(count);
		
		br.close();
	}
	
	//똑같은데 2번째 방법
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int N = Integer.parseInt(st.nextToken());
//		String K = st.nextToken();
//		int result = N;
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for(int i = 0; i < N; i++) {
//			String a = st.nextToken();
//			
//			if(a.contains(K)) result--; //contains 로 문자열안에 특정 문자열이 속해 있는지 확인
//		}
//		
//		System.out.println(result);
//	}

}
