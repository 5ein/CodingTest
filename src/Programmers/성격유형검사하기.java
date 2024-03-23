package programmers;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"}; 
		int[] choices = {5, 3, 2, 7, 5};
		System.out.println(solution(survey, choices));
	}
	
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
			int value = choices[i];
			
			if(value > 0 && value < 4) {
				char ch = survey[i].charAt(0);
				map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
			}else if(value > 4) {
				char ch = survey[i].charAt(1);
				map.put(ch, map.getOrDefault(ch, 0) + value - 4);
			}
		} //for
        
        answer += (map.getOrDefault('R', 0) >= map.getOrDefault('T', 0)? 'R' : 'T');
        answer += (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0)? 'C' : 'F');
        answer += (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0)? 'J' : 'M');
        answer += (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0)? 'A' : 'N');
        
        return answer;
    }
    
    //다른사람풀이1 (char[i] 배열이 사전순으로 정렬됐기 때문에 61-63번 줄에서 <= 기호를 통해 값을 저장하기만 하면 됨)
//    public static String solution(String[] survey, int[] choices) {
//        String answer = "";
//        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
//        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
//        HashMap<Character, Integer> point = new HashMap<Character, Integer>();
//
//        // 점수 기록할 배열 초기화 
//        for (char[] t : type) {
//            point.put(t[0], 0);
//            point.put(t[1], 0);
//        }
//
//        // 점수 기록 
//        for (int idx = 0; idx < choices.length; idx++){
//            if(choices[idx] > 4){
//                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
//            } else {
//                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
//            }
//        }
//
//        // 지표 별 점수 비교 후 유형 기입
//        for (char[] t : type) {
//            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
//        }
//
//        return answer;
//    }
    
    //다른사람풀이2
//    public static String solution(String[] survey, int[] choices) {
//        String answer = "";
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('R', 0);map.put('T', 0);
//        map.put('C', 0);map.put('F', 0);
//        map.put('J', 0);map.put('M', 0);
//        map.put('A', 0);map.put('N', 0);
//
//        for (int i = 0; i < survey.length; i++) {
//            if (choices[i] > 4)
//                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
//            else if (choices[i] < 4) {
//                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
//            }
//        }
//
//
//        if (map.get('R') >= map.get('T'))
//            answer = "R";
//        else
//            answer = "T";
//
//        if (map.get('C') >= map.get('F'))
//            answer += "C";
//        else
//            answer += "F";
//
//        if (map.get('J') >= map.get('M'))
//            answer += "J";
//        else
//            answer += "M";
//
//        if (map.get('A') >= map.get('N'))
//            answer += "A";
//        else
//            answer += "N";
//
//        return answer;
//    }
    
}
