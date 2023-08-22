package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;

public class 문자열나누기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		br.close();
		
		//단어 집합 저장할 wordList
		List<String[]> wordList = new ArrayList<>();
		//부분 문자열 저장할 score (중복 제거)
		Set<String> score = new HashSet<>();
		
		//가능한 부분문자열 만들기
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String first = s.substring(0, i);
				String second = s.substring(i, j);
				String third = s.substring(j);
				wordList.add(new String[]{first, second, third});
				score.add(first);
				score.add(second);
				score.add(third);
			}
		}
		
		//점수 판 만들기
		List<String> tempScoreList = new ArrayList<>(score);
		Collections.sort(tempScoreList);
		
		Map<String, Integer> wordScore = new HashMap<>();
		for (int i = 0; i < tempScoreList.size(); i++) {
			wordScore.put(tempScoreList.get(i), i + 1);
		}
		
		//최고 점수 찾기
		int maxScore = -1;
		for (String[] words : wordList) {
			int tempScore = 0;
			for (String word : words) {
				tempScore += wordScore.get(word);
			}
			maxScore = Math.max(maxScore, tempScore);
		}
		
		System.out.println(maxScore);
	}

}
