package programmers;

public class 직사각형넓이구하기 {

	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		System.out.println(solution(dots));
	}
	
    public static int solution(int[][] dots) {
        int answer = 0;
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];
        
        for (int i = 0; i < dots.length; i++) {
			if(dots[i][0] > maxX) maxX = dots[i][0];
			if(dots[i][0] < minX) minX = dots[i][0];
        	if(dots[i][1] > maxY) maxY = dots[i][1];
        	if(dots[i][1] < minY) minY = dots[i][1];
		}
        
        int x = Math.abs(maxX - minX);
        int y = Math.abs(maxY - minY);
        answer = Math.abs(x * y);
        
        return answer;
    }
    
//    public static int solution(int[][] dots) {
//        int topX = dots[0][0];
//        int botX = dots[0][0]; 
//        int topY = dots[0][1]; 
//        int botY = dots[0][1]; 
//
//        for(int[] x : dots) {
//            if(x[0] >= topX) {
//                topX = x[0];
//            } else {
//                botX = x[0];
//            }
//            if(x[1] >= topY) {
//                topY = x[1];
//            } else {
//                botY = x[1];
//            }
//        }
//        return (topX - botX) * (topY - botY);
//    }

}
