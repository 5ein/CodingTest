package programmers;

public class 글자지우기 {
	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs"; 
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		System.out.println(solution(my_string, indices));
		//programmers
	}

	//char
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        
        char[] s = my_string.toCharArray();
        for (int i : indices) {
			s[i] = '0';
		}
        for(char i : s) {
        	if(i != '0') {
        		answer += i;
        	}
        }
        
        return answer;
    }
    
    //String
//    public static String solution(String my_string, int[] indices) {
//    	String answer = "";
//    	
//        String[] tmp = my_string.split("");
//
//        for (int i = 0; i < indices.length; i++) {
//            tmp[indices[i]] = "";
//        }
//
//        for (String x : tmp) {
//            answer += x;
//        }
//    	
//    	return answer;
//    }
    
    
    
}
