package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10989 {
	//Arrays.sort 이용했는데 얘는 O(NlogN) 이 평균이지만 자칫하면 O(N^2)가 될수 있어 좋지 않음
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		Arrays.sort(arr);
//		
//		for (int i : arr) {
//			//bw.append(i + "\n");
//			bw.write(i + "\n");
//		}
//		
//		bw.flush(); //출력 부분 bw를 비우는 거래
//		
//		bw.close();
//		br.close();
//	}
	
	//카운팅 정렬
	public static void main(String[] args) throws IOException {
	    // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] arr = new int[10001];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            arr[Integer.parseInt(br.readLine())] ++;
        }
 
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(arr[i] > 0){
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
	}

}
