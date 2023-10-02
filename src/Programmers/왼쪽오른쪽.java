package programmers;

import java.util.Arrays;

public class 왼쪽오른쪽 {

	public static void main(String[] args) {
		String[] str_list = {"u", "u", "l", "r"};
		
		System.out.println(Arrays.toString(solution(str_list)));
	}

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        int l = -1;
        int r = -1;
        for (int i = 0; i < str_list.length; i++) {
        	if(str_list[i].equals("l")) {
				l = i;
				break;
			}else if(str_list[i].equals("r")){
				r = i;
				break;
			}
		}
        
        if(l != -1) {
        	answer = new String[l];
        	for (int i = 0; i < l; i++) {
				answer[i] = str_list[i];
			}
        }else if(r != -1) {
        	answer = new String[str_list.length - r - 1];
        	for (int i = r + 1; i < str_list.length; i++) {
				answer[i - r - 1] = str_list[i];
			}
        }
        
        return answer;
    }
    
    //다른사람 방법
//    public static String[] solution(String[] str_list) {
//
//        for (int i = 0; i < str_list.length; i++) {
//
//            if ("l".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, 0, i);
//            } else if ("r".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//            }
//        }
//
//        return new String[0];
//    }
}
