package baekjoon;

import java.util.Scanner;

public class no_3003 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int[] A = new int[6];
//		
//		int b;
//		for (int i = 0; i < 6; i++) {
//			b = sc.nextInt();
//			if(i == 0 || i == 1) {
//				A[i] = 1 - b;
//			}else if(i == 2 || i == 3 || i == 4) {
//				A[i] = 2 - b;
//			}else if(i == 5) {
//				A[i] = 8 - b;
//			}
//			
//			System.out.print(A[i] + " ");
//		}
//		
//		sc.close();
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chass = {1, 1, 2, 2, 2, 8};
		int[] result = new int[6];
		
		int k;
		for (int i = 0; i < chass.length; i++) {
			k = sc.nextInt();
			result[i] = chass[i] - k;
			System.out.print(result[i] + " ");
		}
		
		sc.close();
	}

}
