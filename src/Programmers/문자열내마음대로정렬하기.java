package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);
        
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).substring(n, n+1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        
        return answer;
    }
    
    //왜 실패 ㅠㅠ
//  public static String[] solution(String[] strings, int n) {
//  String[] answer = new String[strings.length];
//  Arrays.sort(strings);
//  char[] N = new char[strings.length];
//  for (int i = 0; i < N.length; i++) {
//  	N[i] = strings[i].charAt(n);
//	}
//  Arrays.sort(N);
//  for (int i = 0; i < N.length; i++) {
//  	for (int j = 0; j < strings.length; j++) {
//  		if(N[i] == strings[j].charAt(n)) {
//  			answer[i] = strings[j];
//  			strings[j] = "";
//  			break;
//  		}
//		}
//	}
//  return answer;
//}
    
}
