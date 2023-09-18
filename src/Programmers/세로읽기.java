package programmers;

public class 세로읽기 {

	public static void main(String[] args) {
		//문자열 my_string과 두 정수 m, c가 주어집니다. 
		//my_string을 한 줄에 m 글자씩 가로로 적었을 때 
		//왼쪽부터 세로로 c번째 열에 적힌 글자들을 
		//문자열로 return 하는 solution 함수를 작성해 주세요.
		
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		
		System.out.println(solution(my_string, m, c));
	}
	
    public static String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i += m) {
        	answer += my_string.substring(i, i + m).charAt(c - 1);
		}
        
        return answer;
    }
    
    //HashMap 이용
//    public static String solution(String my_string, int m, int c) {
//        String answer = "";
//        
//        HashMap<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < my_string.length(); i += m) {
//        	map.putIfAbsent(i / m, my_string.substring(i, i + m));
//        	answer += map.get(i / m).charAt(c - 1);
//		}
//        
//        return answer;
//    }
    
    //다른 사람 풀이
//    public static String solution(String my_string, int m, int c) {
//        String answer = "";
//
//        for (int i = c - 1; i < my_string.length(); i += m) {
//            answer += my_string.charAt(i);
//        }
//        return answer;
//    }

}

