package programmers;

public class 공던지기 {

	public static void main(String[] args) {
		//int[] numbers = {1, 2, 3, 4};
		//int k = 2;
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		int answer = 0;
		
		answer = numbers[2 * (k - 1) % numbers.length];
		
		System.out.println(answer);
	}

}
