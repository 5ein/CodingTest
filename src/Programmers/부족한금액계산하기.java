package programmers;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));
	}
	
//    public static long solution(int price, int money, int count) {
//        long answer = 0;
//        long totalPrice = 0;
//        for (int i = 1; i <= count; i++) {
//        	totalPrice += price * i;
//		}
//        totalPrice -= money;
//        if(totalPrice > 0) answer = totalPrice;
//        return answer;
//    }
    
    public static long solution(int price, int money, int count) {
    	long answer = 0;
    	for (int i = 1; i <= count; i++) {
    		answer += price * i;
    	}
    	answer -= money;
    	if(answer <= 0) answer = 0; 
    	return answer;
    }
    
    //다른사람의 풀이
//    public static long solution(int price, int money, int count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }

}
