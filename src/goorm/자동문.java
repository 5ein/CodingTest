package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자동문 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        double[][] arr = new double[t][3];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Double.parseDouble(st.nextToken());
            arr[i][1] = Double.parseDouble(st.nextToken());
            arr[i][2] = Double.parseDouble(st.nextToken());
        }
        br.close();
        
        for (int i = 0; i < t; i++) {
        	//초기속도 공식: ((자동문의 길이(L) * 2) / 가속도(a))의 제곱근
        	//이동거리 공식: 초기속도 * 적외선 신호의 속도(v)
        	//위의 두 공식 합치면: Math.sqrt((L * 2) / a) * v
            double x = Math.sqrt(2 * arr[i][0] / arr[i][1]) * arr[i][2];
            System.out.printf("%.2f\n", x);
        }
	}
		
}
