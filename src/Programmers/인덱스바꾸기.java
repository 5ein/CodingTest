package programmers;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		System.out.println(solution(my_string, num1, num2));
	}
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        String s = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = s;
        
        for (String i : arr) {
			answer += i;
		}
        
        return answer;
    }
    
    //char 이용
//    public static String solution(String my_string, int num1, int num2) {
//        String answer = "";
//
//        char[] ch = my_string.toCharArray();
//
//        ch[num1] = my_string.charAt(num2);
//        ch[num2] = my_string.charAt(num1);
//
//        answer = String.valueOf(ch);
//        return answer;
//    }
    
    //다른방법
//    public static String solution(String my_string, int num1, int num2) {
//        char temp = my_string.charAt(num1);
//        StringBuilder sb = new StringBuilder(my_string);
//        sb.setCharAt(num1, my_string.charAt(num2));
//        sb.setCharAt(num2, temp);
//        return String.valueOf(sb);
//    }
    
    //String.join("", arr); 이용해서 문자열로 만들기 (split과 반대되는 개념으로 자바 8에 존재)
//    public static String solution(String my_string, int num1, int num2) {
//    	String answer = "";
//    	
//    	String[] arr = my_string.split("");
//    	
//    	String s = arr[num1];
//    	arr[num1] = arr[num2];
//    	arr[num2] = s;
//    	
//    	answer = String.join("", arr);
//    	return answer;
//    }

}
