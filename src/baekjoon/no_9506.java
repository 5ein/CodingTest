package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_9506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) break;
			
			int[] arr = new int[n]; //약수를 담을 배열
			int sum = 0; // 약수들의 합
			int index = 0; // 약수를 담을 배열 인덱스
			
			for (int i = 1; i < n; i++) {
				if(n % i == 0) { //약수일때
					arr[index++] = i; //arr에 약수 저장
					sum += i; //약수의 합
				}
				
				if(sum > n) break;
			}
			
			if(sum != n) {
				System.out.println(n + " is NOT perfect.");
			}else {
				System.out.print(n + " = 1"); //약수 1은 무조건 추가 이기 때문
				for (int i = 1; i < arr.length; i++) {
					if(arr[i] != 0) {
						System.out.print(" + " + arr[i]);
					}else break;
				}
				System.out.println();
			}
			
		}
		
		br.close();
	}

}
