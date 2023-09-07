package programmers;

public class 글자이어붙여문자열만들기 {

	public static void main(String[] args) {
		String my_string = "cvsgiorszzzmrpaqpe";
		
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		
		String answer = solution(my_string, index_list);
		
		System.out.println(answer);
	}
	
//    public static String solution(String my_string, int[] index_list) {
//        String answer = "";
//        
//        String[] arr = my_string.split("");
//        
//        for (int i = 0; i < index_list.length; i++) {
//			answer += arr[index_list[i]];
//		}
//        
//        return answer;
//    }
	
    public static String solution(String my_string, int[] index_list) {
    	String answer = "";
    	
    	String[] arr = my_string.split("");
    	
    	for (int i : index_list) {
			answer += arr[i];
		}
    	
    	return answer;
    }

}
