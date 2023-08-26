package programmers;

public class 구슬을나누는경우의수 {
	public static void main(String[] args) {
		int balls = 3;
		int share = 2;
		int answer = 0;
		
		answer = combination(balls, share);
		
		System.out.println(answer);
	}
	
	public static int combination(int n, int r) {
		if(n == r || r == 0) return 1;
		else return combination(n - 1, r - 1) + combination(n - 1, r);
	}
}
