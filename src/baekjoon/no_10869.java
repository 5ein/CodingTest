package Baekjoon;

import java.util.Scanner;

//사칙연산
public class no_10869 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		
//		System.out.println(A + B);
//		System.out.println(A - B);
//		System.out.println(A * B);
//		System.out.println(A / B);
//		System.out.println(A % B);
//	}
	
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		sc.close();
	}

}
