package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class no_4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			Long val = Long.parseLong(br.readLine());
			
			BigInteger nextPrimeNumber = new BigInteger(String.valueOf(val));
			
			 if (nextPrimeNumber.isProbablePrime(10)) {  // 입력 값이 소수면 그대로 출력 
		        System.out.println(nextPrimeNumber);
			 } else {  // 입력 값이 소수가 아니면 다음 소수를 구해서 출력
		        System.out.println(nextPrimeNumber.nextProbablePrime());
			 }
		}
		br.close();
	}

}
