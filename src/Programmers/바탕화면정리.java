package programmers;

import java.util.Arrays;

public class 바탕화면정리 {

	public static void main(String[] args) {
		String[] wallpaper = {".#...", "..#..", "...#."};
		System.out.println(Arrays.toString(solution(wallpaper)));
	}
	
    public static int[] solution(String[] wallpaper) {
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if(wallpaper[i].charAt(j) == '#') {
					top = Math.min(i, top);
					left = Math.min(j, left);
					bottom = Math.max(i + 1, bottom);
					right = Math.max(j + 1, right);
				}
			}
		}
        
        int[] answer = {top, left, bottom, right};
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(String[] wallpaper) {
//        int min_x=Integer.MAX_VALUE;
//        int min_y=Integer.MAX_VALUE;
//        int max_x=-1;
//        int max_y=-1;
//        for(int i=0;i<wallpaper.length;i++){
//            for(int j=0;j<wallpaper[0].length();j++){
//                if(wallpaper[i].charAt(j)=='#'){
//                    min_x = min_x>i ? i : min_x;
//                    min_y = min_y>j ? j : min_y;
//                    max_x = max_x<i ? i : max_x;
//                    max_y = max_y<j ? j : max_y;
//                }
//            }
//        }
//
//        int[] answer = {min_x,min_y,max_x+1,max_y+1};
//        return answer;
//    }

}
