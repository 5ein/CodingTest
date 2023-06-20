package Doit;

import java.util.Arrays;
import java.util.Scanner;

public class 연습02_04 {

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
		
		System.out.println("b = " + Arrays.toString(copy(a)));
        
        sc.close();
	}
	
	//배열 복사
	static int[] copy(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	

}
