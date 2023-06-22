package doit;

import java.util.Arrays;
import java.util.Scanner;

public class 연습02_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();         // 요솟수

        int[] x = new int[num];            // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(x));
        
        reverse(x);        // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");
        
        sc.close();
	}
	
	//배열의 요소 바꾸기
	static void swap(int[] A, int a, int b) {
		System.out.println("a[" + a + "]과 a[" + b + "]을 교환합니다.");
		int t = A[a];
		A[a] = A[b];
		A[b] = t;
		System.out.println(Arrays.toString(A));
	}
	
	//배열요소를 역순으로 정렬
	static void reverse(int[] A) {
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, A.length - 1 - i);
		}
	}
	
}
