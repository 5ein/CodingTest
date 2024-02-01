package programmers;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
    
	public static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(temp == 'p') p++;
			else if(temp == 'y') y++;
		}
        if(p != y) answer = false;

        return answer;
    }
	
	//변수를 하나만 사용한 예시
//	public static boolean solution(String s) {
//        s = s.toLowerCase();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == 'p')
//                count++;
//            else if (s.charAt(i) == 'y')
//                count--;
//        }
//
//        if (count == 0)
//            return true;
//        else
//            return false;
//    }

}
