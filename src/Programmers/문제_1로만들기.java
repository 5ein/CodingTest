package programmers;

public class 문제_1로만들기 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 1, 14};
		
		System.out.println(solution(num_list));
	}
	
    public static int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
        	while (num_list[i] != 1) {
				if(num_list[i] % 2 == 0) {
					num_list[i] /= 2;
					answer++;
				}else {
					num_list[i] = (num_list[i] - 1) / 2;
					answer++;
				}
			}
		};
        
        return answer;
    }
    
    //다른사람 풀이
    //int 타입이라 1을 뺄 필요가 없음.
//    public static int solution(int[] num_list) {
//        int answer = 0;
//        for(int i = 0;num_list.length>i;i++){
//            while(num_list[i]!=1){
//                num_list[i]/=2;
//                answer++;
//            }
//        }
//        return answer;
//    }
    
    //다른사람 풀이 2 Math.pow(2, j)
//    public int solution(int[] num_list) {
//	    int answer = 0;
//	    int a = 0;
//	    for(int i = 0; i < num_list.length; i++){
//	        int j = 0;
//	        while (num_list[i] >= Math.pow(2, j)) {
//	            a = j;
//	            j++;
//	        }
//	        answer += a;
//	    }
//	    return answer;
//    }
    
}
