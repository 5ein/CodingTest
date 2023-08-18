package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합계산기 {
	//String 이용
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			
			if(s.equals("+")) result += (a + b);
			else if(s.equals("-")) result += (a - b);
			else if(s.equals("*")) result += (a * b);
			else result += (a / b);
		}
		br.close();
		
		System.out.println(result);
	}
	
	//char 이용
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		int t = Integer.parseInt(br.readLine());
//		int result = 0;
//		for (int i = 0; i < t; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			int a = Integer.parseInt(st.nextToken());
//			char c = st.nextToken().charAt(0);
//			int b = Integer.parseInt(st.nextToken());
//			
//			if(c == '+') result += (a + b);
//			else if(c == '-') result += (a - b);
//			else if(c == '*') result += (a * b);
//			else result += (a / b);
//		}
//		br.close();
//		
//		System.out.println(result);
//	}
}
