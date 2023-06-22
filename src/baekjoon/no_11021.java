package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no_11021 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for (int i = 1; i <= T; i++) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			int sum = A + B;
//			System.out.println("Case #" + i + ": "+ sum);
//		}
//
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T =Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;
			bw.write("Case #" + i + ": "+ sum + "\n");
			//bw.newLine(); //줄바꿈 얘 쓰던가 아님 "\n"얘 쓰던가 하면됨
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
