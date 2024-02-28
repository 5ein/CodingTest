package programmers;

import java.util.Arrays;

public class 문제_1차비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
	
//    public static String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//        
//        for (int i = 0; i < arr1.length; i++) {
//        	String row = "";
//			String[] str1 = intToBinaryString(arr1[i], n).split("");
//			String[] str2 = intToBinaryString(arr2[i], n).split("");
//			
//			for (int j = 0; j < n; j++) {
//				if("1".equals(str1[j]) || "1".equals(str2[j])) row += "#";
//				else row += " ";
//			}
//			answer[i] = row;
//		}
//        
//        return answer;
//    }
//    
//    private static String intToBinaryString(int num, int length) {
//        StringBuilder binary = new StringBuilder(Integer.toBinaryString(num));
//        while (binary.length() < length) {
//            binary.insert(0, "0"); // 길이가 부족할 경우 앞에 0을 추가하여 자리수를 맞춤
//        }
//        return binary.toString();
//    }
	
	//좋은코드
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; 
                
        for(int i =0;i<n;i++){
            // 1. arr1과 arr2의 원소들을 이진수로 바꾼 뒤, or 비트 논리연산 수행.
            String str=Integer.toBinaryString(arr1[i] | arr2[i]);
            // 2. 5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            str = String.format("%"+n+"s",str);
            // 3. 1->#, 0 -> 공백 으로 바꾼다.
            str = str.replaceAll("1" , "#");
            str = str.replaceAll("0" , " ");
            // 4. 한 줄 완성.
            answer[i] = str;
        }
        
        return answer;
    }
	
}
