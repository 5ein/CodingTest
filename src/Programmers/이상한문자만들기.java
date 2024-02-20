package programmers;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}
	
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i].equals(" ")) {
        		idx = 0;
        	} else if(idx % 2 == 0) {
        		arr[i] = arr[i].toUpperCase();
        		idx++;
        	} else {
        		arr[i] = arr[i].toLowerCase();
        		idx++;
        	}
        	answer += arr[i];
		}
        return answer;
    }
	
//    public static String solution(String s) {
//    	String answer = "";
//        int idx = 0;
//    	String[] arr = s.split("");
//    	for (String ss : arr) {
//			idx = ss.contains(" ") ? 0 : idx + 1;
//			answer += idx % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//		}
//    	return answer;
//    }

}
