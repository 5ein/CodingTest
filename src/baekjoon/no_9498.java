package Baekjoon;

import java.util.Scanner;

//시험 성적
public class no_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		if(E >= 90) System.out.println("A");
		else if(E >= 80) System.out.println("B");
		else if(E >= 70) System.out.println("C");
		else if(E >= 60) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}

}
