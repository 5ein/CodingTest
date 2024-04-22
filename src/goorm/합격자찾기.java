package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 합격자찾기 {
	//처음에 Int로 풀었다가 틀렸다! double로 바꾸니 정답~
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine()); //시험을 치는 횟수
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine()); //응시 인원
			double[] test = new double[n]; //점수 배열 선언
			double all = 0; //총점
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < test.length; j++) {
				test[j] = Double.parseDouble(st.nextToken()); //점수 배열에 추가
				all += test[j]; //총점에 추가
			}
			double avg = all / n; //평균점수
			int count = 0; //합격자
			for (double j : test) {
				if(j >= avg) count++; //합격자 수
			}
			System.out.println(count + "/" + n); //합격자 수 + / + 전체 수
		}
		br.close();
	}
}
