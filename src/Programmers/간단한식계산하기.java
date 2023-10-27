package programmers;

public class 간단한식계산하기 {
	public static void main(String[] args) {
		String binomial = "43 + 12";
		
		System.out.println(solution(binomial));
	}
	
    public static int solution(String binomial) {
        int answer = 0;
        
        String[] str = binomial.split(" ");
        if(str[1].equals("+")) {
        	answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        }else if(str[1].equals("-")) {
        	answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        }else {
        	answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }
        
        return answer;
    }

}

