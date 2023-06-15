package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A/B
public class no_1008 {
//	//scanner 사용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double A = sc.nextInt();
//		double B = sc.nextInt();
//		
//		System.out.println(A / B);
//	}
	
	//BufferedReader 사용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((double)A / B);
	}
}
