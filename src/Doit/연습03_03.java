package doit;

import java.util.Scanner;

public class 연습03_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		
		int[] x = new int[n]; //int[] a
		int[] y = new int[n]; //int[] idx
		
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색 값 : "); // 키값을 입력받음
		int key = sc.nextInt();
		
		int count = searchIdx(x, n, key, y);
		
		if(count == 0) {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		}else {
			for (int i = 0; i < count; i++) {
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
			}
		}
		
		sc.close();
	}
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
	}

}
