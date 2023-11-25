package programmers;

import java.util.Arrays;

public class 그림확대 {

	public static void main(String[] args) {
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}; 
		int k = 2;
		System.out.println(Arrays.toString(solution(picture, k)));
	}
	
    public static String[] solution(String[] picture, int k) {
    	int newRows = picture.length * k;
    	int newCols = picture[0].length() * k;
    	
        String[] answer = new String[newRows];
        
        for (int i = 0; i < newRows; i++) {
			StringBuilder sb = new StringBuilder();
			int row = i / k;
			
			for (int j = 0; j < newCols; j++) {
				int col = j / k;
				sb.append(picture[row].charAt(col));
			}
			
			answer[i] = sb.toString();
		}
        
        return answer;
    }
	
//    public static String[] solution(String[] picture, int k) {
//        int row = picture.length;
//        int col = picture[0].length();
//        String[] answer = new String[row * k];
//        for (int i=0; i<row; i++) {
//            String tmp = "";
//            for (int j=0; j<col; j++) {
//                tmp += String.valueOf(picture[i].charAt(j)).repeat(k);
//            }
//            for (int h=0; h<k; h++) {
//                answer[i*k+h] = tmp;
//            }
//        }
//        return answer;
//    }

}
