package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1735 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		br.close();
		
		int x1 = a1 * b2 + b1 * a2;
		int x2 = a2 * b2;
		
		//최대 공약수 구하기
		int mod = gcd(x1, x2);
		
		System.out.println(x1/mod + " " + x2/mod);
		
	}
	
	public static int gcd(int a, int b) {
		//a가 b보다 큰 경우에 대해 유클리드 호제법 수행
		if(a <= b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}

}
