package programmers;

import java.util.Arrays;

public class 가장가까운같은글자 {

	public static void main(String[] args) {
		//String s = "banana";
		String s = "foobar";
		System.out.println(Arrays.toString(solution(s)));
	}
	
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
			int num = -1;
			char c = s.charAt(i);
			for (int j = 0; j < i; j++) {
				char c2 = s.charAt(j);
				if(c == c2) num = i - j;
			}
			answer[idx++] = num;
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(String s) {
//        int[] answer = new int[s.length()];
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++) {
//            if(!map.containsKey(s.charAt(i))) {
//                answer[i] = -1;
//                map.put(s.charAt(i), i);
//            }else {
//                int before = map.get(s.charAt(i));
//                answer[i] = i - before;
//                map.put(s.charAt(i), i);
//            }
//        }
//        return answer;
//    }
    
//    public static int[] solution(String s) {
//        int[] answer = new int[s.length()];
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            answer[i] = i - map.getOrDefault(ch, i + 1);
//            map.put(ch, i);
//        }
//        return answer;
//    }
    
//    public static int[] solution(String str) {
//        int[] result = new int[str.length()];
//
//        for(int i=0;i<str.length();i++){
//
//            String subStr = str.substring(0,i);
//            if(subStr.indexOf(str.charAt(i))==-1) {
//                result[i] = -1;
//            }else {
//                result[i] = i-subStr.lastIndexOf(str.charAt(i));
//            }
//        }
//        return result;
//    }

}
