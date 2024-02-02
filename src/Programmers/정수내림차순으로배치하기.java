package programmers;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			arr[i] = Integer.parseInt(s);
        }
        Arrays.sort(arr);
        str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
			str += Integer.toString(arr[i]);
		}
        answer = Long.parseLong(str);
        return answer;
    }
    
//    public static long solution(long n) {
//        String[] list = String.valueOf(n).split("");
//        Arrays.sort(list);
//
//        StringBuilder sb = new StringBuilder();
//        for (String aList : list) sb.append(aList);
//
//        return Long.parseLong(sb.reverse().toString());
//    }

}
