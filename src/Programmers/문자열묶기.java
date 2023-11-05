package programmers;

import java.util.Arrays;

public class 문자열묶기 {

	public static void main(String[] args) {
		String[] strArr = {"a","bc","d","efg","hi"};
		System.out.println(solution(strArr));
	}
	
    public static int solution(String[] strArr) {
        int answer = 0;
        
        int[] count = new int[100000];
        for (String i : strArr) {
			count[i.length()]++;
		}
        
        answer = Arrays.stream(count).max().getAsInt();
        
        return answer;
    }

}
