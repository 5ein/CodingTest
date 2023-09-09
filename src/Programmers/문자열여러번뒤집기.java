package programmers;

public class 문자열여러번뒤집기 {

	public static void main(String[] args) {
		
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		
		System.out.println(solution(my_string, queries));
	}
	
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        
        int len = my_string.length();
        String[] my_str = my_string.split("");
        String[] str = new String[len];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = 0; j <= e-s; j++) {
                str[e-j] = my_str[s+j];
            }
            for(int j = 0; j <= e-s; j++) {
                my_str[s+j] = str[s+j];
            }
        }
        
        for(int i = 0; i < len; i++) {
            answer += my_str[i];
        }
        
        return answer;
    }
}
