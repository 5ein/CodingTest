package Baekjoon;

import java.util.Scanner;

public class no_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[] exam = new double[N];
		double M = 0;
		for (int i = 0; i < exam.length; i++) {
			exam[i] = sc.nextDouble();
			if (exam[i] > M) M = exam[i];
		}
		
		double total = 0;
		for (int i = 0; i < exam.length; i++) {
			exam[i] = (double)exam[i] / M * 100;
			total += exam[i];
		}
		
		System.out.println(total / N);
		
		sc.close();
	}

}
