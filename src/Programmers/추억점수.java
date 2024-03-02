package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
		System.out.println(Arrays.toString(solution(name, yearning, photo)));
	}
	
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
        
        for (int i = 0; i < photo.length; i++) {
        	int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {
				if(map.containsKey(photo[i][j])) {
					sum += map.get(photo[i][j]);
				}
			}
			answer[i] = sum;
		}
        
        return answer;
    }
    
    // 다른사람 풀이
//    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
//        int[] answer = new int[photo.length];
//        for(int i = 0; i < photo.length; i++){
//            for(int j = 0; j < photo[i].length; j++){
//                for(int k = 0; k < name.length; k++){
//                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
//                }
//            }
//        }
//        return answer;
//    }

}
