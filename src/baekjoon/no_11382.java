package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//꼬마 정민
public class no_11382 {

//	public static void main(String[] args) {
//		//scanner
//		Scanner sc = new Scanner(System.in);
//		long A = Long.parseLong(st.nextToken());
//		long B = Long.parseLong(st.nextToken());
//		long C = Long.parseLong(st.nextToken());
//		
//		System.out.println(A + B + C);
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(A + B + C);
	}

}
