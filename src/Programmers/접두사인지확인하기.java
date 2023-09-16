package programmers;

public class 접두사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "nan";
		System.out.println(solution(my_string, is_prefix));
	}
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i <= my_string.length(); i++) {
			if(my_string.substring(0, i).equals(is_prefix)) {
				answer = 1;
				break;
			}
		}
        
        return answer;
    }
    //다른사람 방법
//    public static int solution(String my_string, String is_prefix) {
//        if (my_string.startsWith(is_prefix)) return 1;
//        return 0;
//    }
}
