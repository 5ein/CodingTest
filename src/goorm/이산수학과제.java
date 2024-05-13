package goorm;

import java.util.ArrayList;
import java.util.Scanner;

public class 이산수학과제 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 분자분모쌍으로 들어갈 리스트
        ArrayList<int[]> list = new ArrayList<int[]>();
        
        int n = sc.nextInt();
        int sum = 2; // 루프별 분자+분모 합계
        int cnt = 0; // 리스트에 삽입된 분자분모쌍의 갯수
        
        while(cnt<n)
        {
            // 루프별로 분자+분모의 합계는 모두 동일
            for(int i=sum-1; i>0; i--)
            {
                list.add(new int[]{i, sum-i});
                cnt++;
            }
            
            sum++;
        }
        
        System.out.println(list.get(n-1)[0] + " " + list.get(n-1)[1]);
        sc.close();
	}
	
	
	//틀림
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		br.close();
//		
//		ArrayList<int[]> list = new ArrayList<int[]>();
//		int sum = 2; //루프별 분자 + 분모 합계
//		int cnt = 0; //리스트에 삽입된 분자 분모쌍의 갯수
//		
//		while(cnt < n) {
//			//루프별로 분자 + 분모의 합계는 모두 동일하다.
//			for (int i = sum - 1; i > 0; i--) {
//				list.add(new int[]{i, sum - i});
//				cnt++;
//			}
//			sum++;
//		}
//		
//		System.out.println(list.get(n - 1)[0] + " " + list.get(n - 1)[1]);
//	}
}
