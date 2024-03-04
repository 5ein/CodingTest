package programmers;

public class 카드뭉치 {

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		System.out.println(solution(cards1, cards2, goal));
	}
	
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        for (String s : goal) {
			if(idx1 < cards1.length && s.equals(cards1[idx1])) {
				idx1++;
			}else if(idx2 < cards2.length && s.equals(cards2[idx2])) {
				idx2++;
			}else {
				answer = "NO";
				break;
			}
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static String solution(String[] cards1, String[] cards2, String[] goal) {
//        List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
//        List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));
//
//        String answer = "Yes";
//        for(String str:goal) {
//            if(!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
//                card1Ary.remove(0);
//            } else if(!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
//                card2Ary.remove(0);
//            } else {
//                answer = "No";
//                break;
//            }
//        }
//        return answer;
//    }

}
