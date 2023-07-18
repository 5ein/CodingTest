package baekjoon;

import java.util.Scanner;

public class no_9063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int xmin = 10000; int xmax = -10000;
		int ymin = 10000; int ymax = -10000;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(xmin > x)xmin = x;
			if(xmax < x) xmax = x;
			
			if(ymin > y) ymin = y;
			if(ymax < y) ymax = y;
		}
		sc.close();
		
		System.out.println(Math.abs(xmax - xmin) * Math.abs(ymax - ymin));
	}

}
