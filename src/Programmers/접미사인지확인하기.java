package programmers;

public class 접미사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";
		System.out.println(solution(my_string, is_suffix));
	}
	
    public static int solution(String my_string, String is_suffix) {
    	int answer = 0;
    	
        for (int i = 0; i < my_string.length(); i++) {
			String s = my_string.substring(i);
			if(s.equals(is_suffix)) {
				answer = 1;
				break;
			}
		}
        
        return answer;
    }
    
//    public static int solution(String my_string, String is_suffix) {
//    	int answer = 0;
//    	
//        String[] s = new String[my_string.length()];
//        for (int i = 0; i < s.length; i++) {
//			s[i] = my_string.substring(i);
//			if(s[i].equals(is_suffix)) {
//				answer = 1;
//				break;
//			}
//		}
//    	
//    	return answer;
//    }

}
