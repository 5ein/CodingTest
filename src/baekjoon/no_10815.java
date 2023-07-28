package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_10815 {
	
	//시간초과 뜸
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] card = new int[n];
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < card.length; i++) {
//			card[i] = Integer.parseInt(st.nextToken());
//		}
//		int m = Integer.parseInt(br.readLine());
//		int k;
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < m; i++) {
//			k = Integer.parseInt(st.nextToken());
//			int result = 0;
//			for (int j = 0; j < card.length; j++) {
//				if(card[j] == k) {
//					result = 1;
//				}
//			}
//			bw.append(result + " ");
//		}
//		
//		bw.flush();
//		br.close();
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n, m;
	    int[] arr;
		    
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이분 탐색을 해서 해당 숫자가 있는 경우
            if(binarySearch(num, n, arr)) bw.write("1 ");
            // 이분 탐색을 해서 해당 숫자가 없는 경우
            else bw.write("0 ");
        }

        bw.close();
        br.close();
    }
    private static boolean binarySearch(int num, int n, int[] arr) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if(num < mid) rightIndex = midIndex - 1;
            else if(num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }

}
