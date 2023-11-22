package programmers;

public class 주사위게임1 {

	public static void main(String[] args) {
		int a = 6;
		int b = 1;
		System.out.println(solution(a, b));
	}
	
    public static int solution(int a, int b) {
        int answer = 0;
        
        int hol = 0;
        if(a % 2 != 0) hol++;
        if(b % 2 != 0) hol++;
        
        if(hol == 2) answer = a * a + b * b;
        else if(hol == 1) answer = (a + b) * 2;
        else if(hol == 0) answer = Math.abs(a - b);
        
        return answer;
    }
    
//    public static int solution(int a, int b) {
//    	int answer = 0;
//    	
//        if(a % 2 != 0 && b % 2 != 0) {
//            answer = (a * a) + (b * b);
//        }else if(a % 2 != 0 || b % 2 != 0) {
//            answer = 2 * (a + b);
//        }else if(a % 2 == 0 && b % 2 == 0) {
//            answer = Math.abs(a - b);
//        }
//    	
//    	return answer;
//    }

}
