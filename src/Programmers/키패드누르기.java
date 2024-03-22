package programmers;

public class 키패드누르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10; // 왼쪽 시작점 *
        int right = 12; // 오른쪽 시작점 #
        
        for (int num : numbers) {
			if(num == 1 || num == 4 || num == 7) { //왼쪽 자판
				left = num;
				answer += "L";
			} else if(num == 3 || num == 6 || num == 9) { //오른쪽 자판
				right = num;
				answer += "R";
			} else { //가운데 자판
				if(num == 0) {
					num = 11;
				}
				
				int leftDist = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
				int rightDist = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;
				
				if(leftDist < rightDist) {
					answer += "L";
					left = num;
				} else if(leftDist > rightDist) {
					answer += "R";
					right = num;
				} else { //같을 때
					if(hand.equals("left")) { //왼손잡이
						answer += "L";
						left = num;
					} else { //오른손잡이
						answer += "R";
						right = num;
					}
				} //같을 때
				
			} //가운데 자판
			
		} //for
        
        return answer;
    }

//다른사람 풀이 1
//    public static String solution(int[] numbers, String hand) {
//    	int tempL = 10;
//    	int tempR = 12;
//    	String myhand = ((hand.equals("right"))? "R": "L");
//        String answer = "";
//        for(int i=0 ; i< numbers.length ; i++) {
//            switch(numbers[i]) {
//                case 1: case 4: case 7:
//                    answer += "L";
//                    tempL = numbers[i];
//                    break;
//                case 3: case 6: case 9:
//                    answer += "R";
//                    tempR = numbers[i];
//                    break;
//                default:
//                    String tempHand = checkHand(numbers[i], tempL, tempR, myhand);
//                    if(tempHand.equals("R"))
//                        tempR = numbers[i] + ((numbers[i] == 0)? 11:0);
//                    else tempL = numbers[i] + ((numbers[i] == 0)? 11:0);
//                    answer += tempHand;
//                    break;
//            }
//        }
//        return answer;
//    }
//    private static String checkHand(int tempNum, int tempL, int tempR, String myhand) {
//        int leftDistance = 0;
//        int rightDistance = 0;
//        if(tempNum == 0) tempNum = 11;
//
//        leftDistance = Math.abs((tempNum-1)/3 - (tempL-1)/3) + Math.abs((tempNum-1)%3 - (tempL-1)%3);
//        rightDistance = Math.abs((tempNum-1)/3 - (tempR-1)/3) + Math.abs((tempNum-1)%3 - (tempR-1)%3);
//        //System.out.println(tempNum + ": " + leftDistance + ", " + rightDistance);
//        return ((leftDistance == rightDistance)? myhand: (leftDistance > rightDistance)? "R": "L");
//    }
	
//다른사람 풀이 2
//    public static String solution(int[] numbers, String hand) {
//    	int[][] numpadPos = { //0부터 9까지 좌표 {y,x}
//    			{3,1}, //0
//    			{0,0}, //1
//    			{0,1}, //2
//    			{0,2}, //3
//    			{1,0}, //4
//    			{1,1}, //5
//    			{1,2}, //6
//    			{2,0}, //7
//    			{2,1}, //8
//    			{2,2}  //9
//    	};
//    	int[] leftPos = {3,0}; //초기 위치
//    	int[] rightPos = {3,2}; //초기 위치
//    	hand = (hand.equals("right")) ? "R" : "L";
//
//        String answer = "";
//        for (int num : numbers) {
//            String Umji = pushNumber(numpadPos, leftPos, rightPos, hand, num);
//            answer += Umji;
//
//            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
//            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
//        }
//        return answer;
//    }
//    //num버튼을 누를 때 어디 손을 사용하는가
//    private static String pushNumber(int[][] numpadPos, int[] leftPos, int[] rightPos, String hand, int num) {
//        if(num==1 || num==4 || num==7) return "L";
//        if(num==3 || num==6 || num==9) return "R";
//
//        // 2,5,8,0 일때 어디 손가락이 가까운가
//        if(getDist(numpadPos, leftPos, num) > getDist(numpadPos, rightPos, num)) return "R";
//        if(getDist(numpadPos, leftPos, num) < getDist(numpadPos, rightPos, num)) return "L";
//
//        //같으면 손잡이
//        return hand;
//    }
//    //해당 위치와 번호 위치의 거리
//    private static int getDist(int[][] numpadPos, int[] pos, int num) {
//        return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
//    }
    
}
