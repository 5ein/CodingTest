package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {

	public static void main(String[] args) {
		String[] keymap = {"AGZ", "BSSS"};
		String[] targets = {"ASA","BGZ"};
		System.out.println(Arrays.toString(solution(keymap, targets)));
	}
	
    public static int[] solution(String[] keymap, String[] targets) {
    	 int[] answer = new int[targets.length];
         HashMap<Character, Integer> map = new HashMap<>();
         
         for(int i=0;i<keymap.length;i++){ // keymap 위 모든 알파벳의 최소 클릭 수 구하기
             for(int j=0;j<keymap[i].length();j++){ // 최소 클릭수로 덮어씌우기 위해 문자열 끝부터 시작
                 if (map.containsKey(keymap[i].charAt(j))) {
                     // 최소 클릭 수가 뒤에 나왔을 때 갱신
                     Integer nCurrCnt = map.get(keymap[i].charAt(j));
                     if (nCurrCnt > (j+1)){
                         map.put(keymap[i].charAt(j),j+1);
                     }
                 }
                 else {
                     map.put(keymap[i].charAt(j),j+1);
                 }
                 
             }
         }
         
         for(int i=0;i<targets.length;i++){ // 모든 targets 단어에 대해 반복
             int nCnt = 0;
             for(int j=0;j<targets[i].length();j++){
                 char alpha = (targets[i].charAt(j));
                 Integer nMinClick = map.get(alpha);
                 if ( nMinClick != null ) {
                     nCnt += nMinClick;
                 }
                 else{
                     nCnt = -1;  // i번째 단어는 작성할 수 없음
                     break;
                 }
             }
             answer[i] = nCnt;
         }
         
         return answer;
    }
    
    //다른사람 풀이
//    public static int[] solution(String[] keymap, String[] targets) {
//        int[] minTouch = new int['Z' - 'A' + 1];
//        Arrays.fill(minTouch, 200);
//        for (String key : keymap) {
//            for (int i = 0; i < key.length(); i++) {
//                minTouch[key.charAt(i) - 'A'] = Math.min(minTouch[key.charAt(i) - 'A'], i + 1);
//            }
//        }
//        int[] answer = new int[targets.length];
//        for (int i = 0; i < targets.length; i++) {
//            String target = targets[i];
//            int sum = 0;
//            boolean canMake = true;
//            for (int j = 0; j < target.length(); j++) {
//                if (minTouch[target.charAt(j) - 'A'] == 200) {
//                    canMake = false;
//                    break;
//                }
//                sum += minTouch[target.charAt(j) - 'A'];
//            }
//            answer[i] = canMake ? sum : -1;
//        }
//        return answer;
//    }
    
}
