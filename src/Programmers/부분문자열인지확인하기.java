package programmers;

public class 부분문자열인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		System.out.println(solution(my_string, target));
	}
    public static int solution(String my_string, String target) {
        int answer = 0;
		if(my_string.contains(target)) answer = 1;
        return answer;
    }
    
    //다른 풀이
//    public static int solution(String my_string, String target) {
//        return my_string.indexOf(target) > -1 ? 1 : 0;
//    }

}
