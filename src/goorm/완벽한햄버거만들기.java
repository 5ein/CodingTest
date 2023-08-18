package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 완벽한햄버거만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		br.close();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (String i : s) {
			arr.add(Integer.parseInt(i));
		}
		
		//최대값의 인덱스
		int maxIndex = arr.indexOf(Collections.max(arr));
		
		//최대값 기준으로 좌 우 리스트 나눠서 생성
		ArrayList<Integer> left = new ArrayList<>(arr.subList(0, maxIndex)); //0부터 max값 전 까지 저장
		ArrayList<Integer> right = new ArrayList<>(arr.subList(maxIndex, n)); //max값 부터 n - 1 값 까지 저장
		
		Collections.sort(left); //오름차순 정렬
		Collections.sort(right, Collections.reverseOrder()); //내림차순 정렬
		
		// 좌측 리스트와 우측 리스트 합치기
		ArrayList<Integer> sortedArr = new ArrayList<>();
		sortedArr.addAll(left);
		sortedArr.addAll(right);
		
		//원래의 arr과 정렬한 리스트 sortedArr이 동일하다면 완벽한 햄버거의 합 출력, 아니라면 0을 출력
		int result = 0;
		if(arr.equals(sortedArr)) {
			for (Integer i : sortedArr) {
				result += i;
			}
		}
		System.out.println(result);
		
//stream 변환 후 mapToInt로 요소를 Integer에서 int로 변환, sum으로 모든 요소를 더하기
		//int sum = arr.stream().mapToInt(Integer::intValue).sum();
		
	}
}
