package programmers;import java.util.Arrays;

public class 문자열계산하기 {

	public static void main(String[] args) {
		String my_string = "3 + 4";
		System.out.println(solution(my_string));
	}
    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        
        if(arr[1].equals("+")) {
        	answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        }else {
        	answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        }
        
        for (int i = 3; i < arr.length; i += 2) {
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i + 1]);
			}else {
				answer -= Integer.parseInt(arr[i + 1]);

			}
		}
        
        return answer;
    }
    
    //더 좋은 방법!!
//    public static int solution(String my_string) {
//    	int answer = 0;
//    	String[] arr = my_string.split(" ");
//    	
//    	answer = Integer.parseInt(arr[0]);
//    	
//    	for (int i = 1; i < arr.length; i += 2) {
//    		if(arr[i].equals("+")) {
//    			answer += Integer.parseInt(arr[i + 1]);
//    		}else {
//    			answer -= Integer.parseInt(arr[i + 1]);
//    			
//    		}
//    	}
//    	
//    	return answer;
//    }

}
