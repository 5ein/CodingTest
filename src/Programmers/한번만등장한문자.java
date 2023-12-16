package programmers;

import java.util.Arrays;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
	    String answer = "";
	    String[] str = s.split("");
	    int count = 0;
	    
	    Arrays.sort(str);
	    
	    for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					count++;
				}
			}
			if(count == 1) {
				answer += str[i];
			}
		}
	    
	    return answer;
	}
	
//    public static String solution(String s) {
//        int[] alpha = new int[26];
//        for(char c : s.toCharArray()){
//            alpha[c - 'a']++;
//        }
//
//        StringBuilder answer = new StringBuilder();
//        for(int i = 0; i < 26; i++){
//            if(alpha[i] == 1){
//                answer.append((char)(i + 'a'));
//            }
//        }
//        return answer.toString();
//    }
	
//    public static String solution(String s) {
//
//        HashSet<String> set = new HashSet<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            String replace = s.replace(s.charAt(i) + "", "");
//            if(s.length() - replace.length() == 1){
//                set.add(s.charAt(i)+"");
//            }
//        }
//        ArrayList<String> list = new ArrayList<>(set);
//        Collections.sort(list);
//        return String.join("", list);
//    }
}
