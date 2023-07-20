package baekjoon;

import java.util.Scanner;

public class no_24264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어지는데
        //이거의 n*n을 했을때 int로는 overflow가 발생할 수 있기 떄문에 long으로 !
		long n = sc.nextLong();
		sc.close();
		
		System.out.println(n * n);
		System.out.println(2);
	}

}
