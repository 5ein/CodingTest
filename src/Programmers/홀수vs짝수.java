package programmers;

public class 홀수vs짝수 {

	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		
		System.out.println(solution(num_list));
	}
	
//    public static int solution(int[] num_list) {
//        int answer = 0;
//        int one = 0;
//        int two = 0;
//        for (int i = 0; i < num_list.length; i++) {
//			if(i % 2 == 0) {
//				two += num_list[i];
//			}else {
//				one += num_list[i];
//			}
//		}
//        
//        if(one >= two) {
//        	answer = one;
//        }else {
//        	answer = two;
//        }
//        
//        return answer;
//    }
    
    public static int solution(int[] num_list) {
    	int answer = 0;
    	int one = 0;
    	int two = 0;
    	for (int i = 0; i < num_list.length; i++) {
    		if(i % 2 == 0) {
    			two += num_list[i];
    		}else {
    			one += num_list[i];
    		}
    	}
    	
    	answer = one > two ? one : two;
    	
    	return answer;
    }

}
