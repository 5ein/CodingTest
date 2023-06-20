package Doit;

import java.util.Arrays;
import java.util.Scanner;

public class 연습2_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();         // 요솟수

        int[] x = new int[num];            // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);        // 배열 a의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(x));
	}
	
	//배열의 요소 바꾸기
	static void swap(int[] A, int a, int b) {
		int t = A[a];
		A[a] = A[b];
		A[b] = t;
	}
	
	//배열요소를 역순으로 정렬
	static void reverse(int[] A) {
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, A.length - 1 - i);
		}
	}
	
}
