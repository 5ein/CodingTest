package programmers고득점Kit;

import java.util.Arrays;

public class 정렬_가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		
		String answer = "";
		
		String[] SN = new String[numbers.length];
		
		//int형 배열을 String형 배열로 바꿈
		for (int i = 0; i < numbers.length; i++) {
			SN[i] = Integer.toString(numbers[i]);
		}
		
		//두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
		Arrays.sort(SN, (a, b) -> (b + a).compareTo(a + b));
		
		//배열에 0밖에 없을 경우 0만 프린트
		if(SN[0].equals("0")) System.out.println(0);
		
		//정렬된 숫자 붙이기
		for (String s : SN) {
			answer += s;
		}
		
		System.out.println(answer);
		
	}

}
