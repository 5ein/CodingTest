package programmers;

import java.util.Arrays;

public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3}; 
		String direction = "right";
        int[] answer = new int[numbers.length];
		
        
        if(direction.equals("right")) {
        	int last = numbers[numbers.length - 1];
        	answer[0] = last;
        	for (int i = 1; i < answer.length; i++) {
        		answer[i] = numbers[i - 1];
			}
        }else {
        	int first = numbers[0];
        	answer[answer.length - 1] = first;
        	for (int i = 0; i < answer.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
        }
        
        System.out.println(Arrays.toString(answer));
		
	}

}
