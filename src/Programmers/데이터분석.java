package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 데이터분석 {

	public static void main(String[] args) {
		//{"코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"}
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int val_ext = 20300501;
		String sort_by = "remain";
		
		System.out.println(Arrays.toString(solution(data, ext, val_ext, sort_by)));
	}
	
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        String[] s = {"code", "date", "maximum", "remain"};
        int extIdx = 0, sortIdx = 0;
        
        for (int i = 0; i < s.length; i++) {
			if(ext.equals(s[i])) extIdx = i;
			if(sort_by.equals(s[i])) sortIdx = i;
		}
        
        for (int i = 0; i < data.length; i++) {
			if(data[i][extIdx] < val_ext) list.add(data[i]);
		}
        
        // *lambda, Comparator 사용시 final 이나 effectively final여야함
        final int si = sortIdx; //람다식에서 사용하기 위해
        Collections.sort(list, (o1, o2) -> o1[si] - o2[si]);
        
		int[][] answer = new int[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
	
}
