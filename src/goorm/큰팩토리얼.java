package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 큰팩토리얼 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		BigInteger result = factorial(n);
		BigInteger m = BigInteger.valueOf(1000000007);
		
		result = result.mod(m); //나머지 구하기
		System.out.println(result);
	}
	
	public static BigInteger factorial (int n) {
		BigInteger fac = BigInteger.ONE;
		
        for (int i = 1; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
            fac = fac.mod(BigInteger.valueOf(1000000007)); // 중간 결과를 나머지로 나누기
        }

	    return fac;
	}
	
/* 
 * BigInteger BI1 = BigInteger.valueOf(1000000007);
   BigInteger BI2 = BigInteger.valueOf(100000);
   int i = 1;
   long l = 1234567890123456789L;
 * BI1.add(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2)을 더함
 * BI1.subtract(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2)을 뺌
 * BI1.BI2ultiply(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2)을 곱함
 * BI1.divide(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2)을 나눈 몫
 * BI1.BI2od(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2)을 나눈 나머지
 * BI1.coBI2pareTo(BI2): 현재 BigInteger인스턴스(BI1)에 다른 BigInteger값(BI2) 비교
   작으면 음수, 같으면 0, 크면 양수 반환
 * BI1.equals(BI2): 현재 BigInteger인스턴스(BI1)에 주어진 객체(BI2)을 비교
   같으면 true 반환
 * BI1.intValue(): 현재 BigInteger값(BI1)을 int로 변환
 * BI1.longValue(): 현재 BigInteger값(BI1)을 long으로 변환
 * BI1.toString(): 현재 BigInteger값(BI1)을 문자열로 변환
 * BigInteger.valueOf(l): 주어진 long값(l)을 기반으로 BigInteger인스턴스를 생성합니다.
 * BI1.pow(i): 현재 BigInteger인스턴스(BI1)값을 지수(i)로 거듭제곱한 결과
 * */
}
