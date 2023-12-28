package programmers;

import java.util.Arrays;

public class 캐릭터의좌표 {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		System.out.println(Arrays.toString(solution(keyinput, board)));
	}
	
//    public static int[] solution(String[] keyinput, int[] board) {
//        int[] answer = {0, 0};
//        for (int i = 0; i < keyinput.length; i++) {
//			if(keyinput[i].equals("left")) {
//				answer[0]--;
//				if(answer[0] < -(int)(board[0] / 2))
//					answer[0] = -(int)(board[0] / 2);
//			} else if(keyinput[i].equals("right")) {
//				answer[0]++;
//				if(answer[0] > (int)(board[0] / 2))
//                    answer[0] = (int)(board[0] / 2);
//			} else if(keyinput[i].equals("up")) {
//				answer[1]++;
//				if(answer[1] > (int)(board[1] / 2))
//                    answer[1] = (int)(board[1] / 2);
//			}
//			else if(keyinput[i].equals("down")) {
//				answer[1]--;
//				if(answer[1] < -(int)(board[1] / 2))
//                    answer[1] = -(int)(board[1] / 2);
//			}
//		}
//        
//        return answer;
//    }
	
    public static int[] solution(String[] keyinput, int[] board) {
    	int[] answer = {0, 0};
    	int maxWidth = board[0] / 2;
    	int maxHeight = board[1] / 2;
    	for (int i = 0; i < keyinput.length; i++) {
    		if(keyinput[i].equals("left")) {
    			if((answer[0] - 1) >= (-1 * maxWidth)) answer[0]--;
    		} else if(keyinput[i].equals("right")) {
    			if((answer[0] + 1) <= maxWidth) answer[0]++;
    		} else if(keyinput[i].equals("up")) {
    			if((answer[1] + 1) <= maxHeight) answer[1]++;
    		}
    		else if(keyinput[i].equals("down")) {
    			if((answer[1] - 1) >= (-1 * maxHeight))answer[1]--;
    		}
    	}
    	
    	return answer;
    }
    
//    public static int[] solution(String[] keyinput, int[] board) {
//        int[] now = {0, 0};
//        for (int i = 0; i < keyinput.length; i++){
//            if(keyinput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
//            else if(keyinput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
//            else if(keyinput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
//            else if(keyinput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
//            }
//        return now;
//    }

}
