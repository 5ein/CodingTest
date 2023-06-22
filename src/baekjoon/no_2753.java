package Baekjoon;

import java.util.Scanner;

//윤년
public class no_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		
		if((E % 4 == 0) &&(E % 100 != 0) || (E % 400 == 0)) System.out.println(1);
		else System.out.println(0);
		
		sc.close();
		
	}

}
