package programmers;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1;
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
//	public static String[] solution(String[] strings, int n) {
//		Arrays.sort(strings);
//		String[] answer = new String[strings.length];
//		char[] arr = new char[strings.length];
//		for (int i = 0; i < strings.length; i++) {
//			arr[i] = strings[i].charAt(n);
//		}
//		Arrays.sort(arr);
//		List<String> list = new ArrayList<>(Arrays.asList(strings));
//		for (int i = 0; i < answer.length; i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if (list.get(j).charAt(n) == arr[i]) {
//					answer[i] = list.get(j);
//					list.remove(list.get(j));
//					break;
//				}
//			}
//		}
//		return answer;
//	}
	
	//좋은 풀이 같음
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        // 각 문자열의 n번째 문자를 맨 앞에 붙여서 저장
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        
        // 문자열 배열을 정렬
        Arrays.sort(answer);
        
        // 정렬된 문자열 배열에서 n번째 문자를 제거하고 반환
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }
        
        return answer;
	}
	
	// 다른사람 풀이
//    public static String[] solution(String[] strings, int n) {
//        Arrays.sort(strings);
//        String[] answer = new String[strings.length];
//        for(int i = 0; i < strings.length; i++) {
//            answer[i] = strings[i].substring(n, n+1);
//        }
//        Arrays.sort(answer);
//        
//        List<String> list = new ArrayList<>(Arrays.asList(strings));
//        for(int i = 0; i < answer.length; i++) {
//            for(int j = 0; j < list.size(); j++) {
//                if(list.get(j).substring(n, n+1).equals(answer[i])) {
//                    answer[i] = list.get(j);
//                    list.remove(list.get(j));
//                    break;
//                }
//            }
//        }
//        
//        return answer;
//    }
    
}
