package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 개인정보수집유효기간 {

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = { "A 6", "B 12", "C 3" };
		String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		System.out.println(Arrays.toString(solution(today, terms, privacies)));
	}

	public static int[] solution(String today, String[] terms, String[] privacies) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String, String> map = new HashMap<>();
		for (String term : terms) {
			String[] s = term.split(" ");
			map.put(s[0], s[1]);
		}

		String[] day = today.split("\\."); // .을 넣고 싶을때는 이스케이프 문자(\\)를 사용하여야함
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		int dday = Integer.parseInt(day[2]);
		
		for (int i = 0; i < privacies.length; i++) {
			String date = privacies[i].split(" ")[0];
			int type = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28;
			String[] pDate = date.split("\\.");
			int pYear = Integer.parseInt(pDate[0]);
			int pMonth = Integer.parseInt(pDate[1]);
			int pDay = Integer.parseInt(pDate[2]);
			
			int pterm = (year - pYear) * 12 * 28 + (month -pMonth) * 28 + (dday - pDay);
			if(pterm >= type) list.add(i + 1);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
	
	
	//다른사람의 풀이
//	   public int[] solution(String today, String[] terms, String[] privacies) {
//	        List<Integer> answer = new ArrayList<>();
//	        Map<String, Integer> termMap = new HashMap<>();
//	        int date = getDate(today);
//
//	        for (String s : terms) {
//	            String[] term = s.split(" ");
//
//	            termMap.put(term[0], Integer.parseInt(term[1]));
//	        }
//	        for (int i = 0; i < privacies.length; i++) {
//	            String[] privacy = privacies[i].split(" ");
//
//	            if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
//	                answer.add(i + 1);
//	            }
//	        }
//	        return answer.stream().mapToInt(integer -> integer).toArray();
//	    }
//
//	    private int getDate(String today) {
//	        String[] date = today.split("\\.");
//	        int year = Integer.parseInt(date[0]);
//	        int month = Integer.parseInt(date[1]);
//	        int day = Integer.parseInt(date[2]);
//	        return (year * 12 * 28) + (month * 28) + day;
//	    }

}
