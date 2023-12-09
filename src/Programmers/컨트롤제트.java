package programmers;

public class 컨트롤제트 {

	public static void main(String[] args) {
		String s = "1 2 Z 3";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i].equals("Z")){
        		answer -= Integer.parseInt(arr[i - 1]);
        	}else {
        		answer += Integer.parseInt(arr[i]);
        	}
		}
        return answer;
    }
    
    //스택 사용
//    public static int solution(String s) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) {
//                stack.pop();
//            } else {
//                stack.push(Integer.parseInt(w));
//            }
//        }
//        for (int i : stack) {
//            answer += i;
//        }
//        return answer;
//    }
    
}
