package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2869 {
	//1. Scanner
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int V = sc.nextInt();
	
	//여기서부터
	//1. 
//		int m = 0;
//		int day = 1;
//		
//		for (int i = 0; i < V/(A - B) + 1; i++) {
//			m += A;
//			if (m >= V) break;
//			m -= B;
//			day++;
//		}
	
	//2.
//		int m = 0;
//		int day = 1;
//		
//		do {
//			m += A;
//			if (m >= V) break;
//			m -= B;
//			day++;
//		} while (m < V);
	//여기까지는 시간초과됨.
//		
//		int day = (V - B) / (A - B);
//		 
//		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
//		if( (V - B) % (A - B) != 0 ) {
//			day++;
//		}
//		
//		System.out.println(day);
//		
//		sc.close();
//	}

	//2. BufferedReader, StringTokenizer
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V - B) / (A - B);
		 
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if( (V - B) % (A - B) != 0 ) {
			day++;
		}
		
		System.out.println(day);
		
		br.close();
	}

}
