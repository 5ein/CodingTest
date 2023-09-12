package programmers;

public class 부분문자열이어붙여문자열만들기 {
	public static void main(String[] args) {
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		
		System.out.println(solution(my_strings, parts));
	}
	
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < parts.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
        
        return answer;
    }
    
    //StringBuilder
//    public static String solution(String[] my_strings, int[][] parts) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < my_strings.length; i++) {
//            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
//        }
//
//        return sb.toString();
//    }
//    
    //StringBuffer
//    public static String solution(String[] my_strings, int[][] parts) {
//        StringBuffer answer = new StringBuffer();
//
//        for(int idx=0; idx<my_strings.length; idx++) {
//            answer.append(my_strings[idx].substring(parts[idx][0], parts[idx][1]+1));
//        }
//
//        return answer.toString();
//    }	
	
}
