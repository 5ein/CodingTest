package programmers고득점Kit;

public class 완전탐색_최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int answer = 0;
		int x = 0, y = 0;
		
		for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				int e = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = e;
			}
			
			if(sizes[i][0] > x) x = sizes[i][0];
			if(sizes[i][1] > y) y = sizes[i][1];
		}
		
		answer = x * y;
		
		System.out.println(answer);
		
		// 다른 사람 풀이
//		int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        System.out.println(answer);
	}

}
