package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행복은성적순이아니잖아요 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        boolean isHappy = true;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()); // 과목별 학생수
            int s = Integer.parseInt(st.nextToken()); // 구름이의 등수
            int n = Integer.parseInt(st.nextToken()); // a+ 성적 순 비율
            int k = Integer.parseInt(st.nextToken()); // 과목의 수행평가 개수
            int m = Integer.parseInt(st.nextToken()); // a+ 컷

            int[] v = new int[k]; // 수행평가 점수 배열
            for (int j = 0; j < k; j++) {
                v[j] = Integer.parseInt(st.nextToken());
            }

            // 첫 번째 조건: a+ 성적 순 비율 조건을 만족하는지 확인
            if (n < 100 - ((l - s) * 100 / l)) {
                isHappy = false;
                break;
            }

            // 두 번째 조건: 수행평가 점수가 a+ 컷 이상인지 확인
            for (int j = 0; j < k; j++) {
                if (v[j] < m) {
                    isHappy = false;
                    break;
                }
            }

            if (!isHappy) break;
        }

        br.close();

        // 결과 출력
        if (isHappy) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
	}
}
