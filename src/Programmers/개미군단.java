package programmers;

public class 개미군단 {

	public static void main(String[] args) {
		int hp = 24;
		int answer = 0;
		
		int[] ant = {5, 3, 1};
		
		for (int i : ant) {
			answer += hp / i;
			hp = hp % i;
		}
		
		//다른사람 풀이
//		System.out.println(hp / 5 + (hp % 5 / 3) + hp % 5 % 3);
		
		System.out.println(answer);
	}

}
