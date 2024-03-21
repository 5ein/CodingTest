package programmers;

import java.util.Stack;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {0,2,5,0,1}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int move : moves) {
			for (int i = 0; i < board.length; i++) {
				if(board[i][move - 1] != 0) {
					if(stack.peek() == board[i][move - 1]) {
						stack.pop();
						answer += 2;
					} else {
						stack.push(board[i][move - 1]);
					}
					board[i][move - 1] = 0;
					break;
				}
			}
		}
        
        return answer;
    }
    
//    public static int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        List<Integer> nums = new ArrayList<Integer>();
//
//        for(int i=0;i<moves.length;i++){
//            for(int j=0;j<board.length;j++){
//                if(board[j][moves[i]-1]!=0){
//                    nums.add(board[j][moves[i]-1]);
//                    board[j][moves[i]-1]=0;
//                    break;
//                }
//
//            }
//
//        }
//        for(int k=0;k<nums.size();k++){
//            if(k!=(nums.size()-1)){
//                if(nums.get(k)==nums.get(k+1)){
//                    nums.remove(k);
//                    nums.remove(k);
//                    answer++;
//                    k=-1;
//
//                }
//
//            }
//        }
//
//        return answer*2;
//    }

}
