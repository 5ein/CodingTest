package doit;

import java.util.Arrays;
import java.util.Scanner;

public class 연습02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
        int num = sc.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수가 num인 배열 생성

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        System.out.println("x = " + Arrays.toString(x));
		
        System.out.println("모든 요소 합계: " + sumOf(x));
        
        sc.close();
	}
	
	//배열의 요솟값의 합 구하기
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}
