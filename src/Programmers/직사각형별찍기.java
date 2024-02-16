package programmers;

import java.util.Scanner;

public class 직사각형별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
    }
    
    //색 다른 풀이 법
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//        IntStream.range(0, a).forEach(s -> sb.append("*"));
//        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
//    }

}
