package programmers;

public class PCCE기출문제9 {

	public static void main(String[] args) {
		String[][] board = {{"blue", "red", "orange", "red"}, 
							{"red", "red", "blue", "orange"}, 
							{"blue", "orange", "red", "red"}, 
							{"orange", "orange", "red", "blue"}};
		int h = 1;
		int w = 1;
		
		System.out.println(solution(board, h, w));
	}
	
    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String sC = board[h][w];

        if(h > 0 && sC.equals(board[h-1][w])) answer++;
        if(h < board.length - 1 && sC.equals(board[h+1][w])) answer++;
        if(w > 0 && sC.equals(board[h][w-1])) answer++;
        if(w < board[h].length - 1 && sC.equals(board[h][w+1])) answer++;
        return answer;
    }
    
    //다른 방법 1
//    public static int solution(String[][] board, int h, int w) {
//    	int[] dx = {1, -1, 0, 0};
//        int[] dy = {0, 0, 1, -1};
//        
//        int answer = 0;
//        String color = board[h][w];
//        for(int i = 0; i < 4; i++){
//            int cx = w + dx[i];
//            int cy = h + dy[i];
//            if(cx < 0 || cx >= board[0].length
//            || cy < 0 || cy >= board.length) continue;
//            if(board[cy][cx].equals(color)) answer++;
//        }
//        return answer;
//    }
	
    //다른 방법 2
//    public static int solution(String[][] board, int h, int w) {
//        int answer = 0;
//        
//        String s = board[h][w];
//        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 상, 하, 좌, 우
//        for (int[] dir : directions) {
//			int moveH = h + dir[0];
//			int moveW = w + dir[1];
//			
//			if((moveH >= 0) && (moveH < board.length) && (moveW >= 0) && (moveW < board[0].length)) {
//				if(s.equals(board[moveH][moveW])) answer++;
//			}
//		}
//
//        return answer;
//    }

}
