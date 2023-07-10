package baekjoon;

import java.util.Scanner;

public class no_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int crossCount = 1;
		int prevCountSum = 0;
		
		while (true) {
			if(x <= prevCountSum + crossCount) {
				if(crossCount % 2 == 1) {
					System.out.println((crossCount - (x - prevCountSum - 1)) 
							+ "/" + (x - prevCountSum));
					break;
				}else {
					System.out.println((x - prevCountSum) + "/" 
							+ (crossCount - (x - prevCountSum - 1)));
					break;
				}
			}else {
				prevCountSum += crossCount;
				crossCount++;
			}
		}
		
		sc.close();
	}

}
