package baekjoon;

import java.util.Scanner;

public class no_25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double aa = 0; //학점 * 과목평점
		double point = 0; //총 학점
		
		for (int i = 0; i < 20; i++) {
			String title = sc.next(); //과목
			double a = sc.nextDouble(); //학점
			String b = sc.next(); //평점
			
			System.out.println(title);
			
			if(b.equals("A+")) {
				aa += a * 4.5;
				point += a;
			}else if(b.equals("A0")) {
                aa += a * 4.0;
                point += a;
            }else if (b.equals("B+")) {
                aa += a * 3.5;
                point += a;
            }else if (b.equals("B0")) {
                aa += a * 3.0;
                point += a;
            }else if (b.equals("C+")) {
                aa += a * 2.5;
                point += a;
            }else if (b.equals("C0")) {
                aa += a * 2.0;
                point += a;
            }else if (b.equals("D+")) {
                aa += a * 1.5;
                point += a;
            }else if (b.equals("D0")) {
                aa += a * 1.0;
                point += a;
            }else if (b.equals("F")) {
                aa += a * 0.0;
                point += a;
            }
		}
		
		System.out.printf("%.6f", aa / point);
		sc.close();
	}

}
