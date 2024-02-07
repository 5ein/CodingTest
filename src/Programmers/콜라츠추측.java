package programmers;

public class 콜라츠추측 {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(solution(num));
	}
	
    public static int solution(int num) {
        long n = num;
    	int answer = 0;
        while (n != 1) {
        	if(n % 2 == 0) n /= 2;
        	else n = n * 3 + 1;
    		
        	answer++;
        	
        	if(answer > 500) return -1;
		}
        return answer;
    }
    
//    public static int solution(long num) {
//        int answer = 0;
//
//        while(num != 1){
//            answer++;
//            if(answer==500)
//                return -1;
//            if(num%2==0){
//                num/=2;
//            }else{
//                num=num*3+1;
//            }
//        }
//        return answer;
//    }

}
