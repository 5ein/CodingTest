package Doit;

import java.util.Arrays;
import java.util.Scanner;

public class 연습02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
        int num = sc.nextInt(); // 요솟수
        
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
		System.out.println("a = " + Arrays.toString(a));
		
		System.out.println("배열 a의 모든 요소를 배열 b에 역순으로 copy 하였습니다.");
		System.out.println("b = " + Arrays.toString(rcopy(a)));
		
		sc.close();
	}
	
	//역순으로 배열 복사하기
	static int[] rcopy(int[] a) {
		int[] b = new int[a.length];
		int x = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[i]= a[x];
			x++;
		}
		return b;
	}
	
}
