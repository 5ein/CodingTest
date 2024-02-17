package programmers;

import java.util.Arrays;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		System.out.println(Arrays.toString(solution(n, m)));
	}
	
    public static int[] solution(int n, int m) {
    	int max = Math.max(n, m);
    	int min = Math.min(n, m);
    	
    	//최대공약수
    	while (min != 0) {
    		int r = max % min;
    		max = min;
    		min = r;
		}
    	int gcd = max;
    	
    	//최소공배수 = 두수의 곱 / 최대공약수
    	int lcm = n * m / max;
    	
    	int[] answer = {gcd, lcm};
        return answer;
    }

}
