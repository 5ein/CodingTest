package baekjoon;

import java.util.Scanner;

public class no_24313 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		sc.close();
		
		int result = (a1 * n0 + a0 <= c * n0) && (c >= a1) ? 1: 0;
		// c >= a1 식은 a₀이 음수 일 경우 문제가 생김
		//n을 1을 입력받으면 해당 만족여부를 거를 수가 없다. 그래서 조건을 a₁<= c를 걸어준 것 같다.
		//그렇게 되면, 왼쪽은 오른쪽보다 절대 커질 수 없기때문에!
		
		System.out.println(result);
	}

}
