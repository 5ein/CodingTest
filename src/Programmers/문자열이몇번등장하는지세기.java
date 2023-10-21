package programmers;

public class 문자열이몇번등장하는지세기 {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		
		System.out.println(solution(myString, pat));
	}
	
    public static int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
			if(myString.substring(i, i + pat.length()).equals(pat)) {
				answer++;
			}
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(String myString, String pat) {
//        int cnt = 0;
//        for(int i=0; i<myString.length(); i++) {
//            if(myString.substring(i).startsWith(pat)){
//                cnt++;
//            }
//        }
//        return cnt;
//    }
    
//    public static int solution(String myString, String pat) {
//        int answer = 0;
//
//        String tmp = "";
//        for (char c : myString.toCharArray()) {
//            tmp += c;
//            if (tmp.endsWith(pat)) {
//                answer++;
//            }
//        }
//        return answer;
//    }

}
