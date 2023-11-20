package programmers;

public class 꼬리문자열 {

	public static void main(String[] args) {
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		System.out.println(solution(str_list, ex));
	}
	
    public static String solution(String[] str_list, String ex) {
        String answer = "";
        
        for (String s : str_list) {
			if(!s.contains(ex)) answer += s;
		}
        
        return answer;
    }

}
