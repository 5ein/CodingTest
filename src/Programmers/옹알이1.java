package programmers;

public class 옹알이1 {

	public static void main(String[] args) {
		//String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"}; 
		
		System.out.println(solution(babbling));
	}
	
    public static int solution(String[] babbling) {
        int answer = 0;
        
        String[] key = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
			for (String k : key) {
				if(babbling[i].contains(k)) {
					babbling[i] = babbling[i].replace(k, " ");
				}
			}
			if(babbling[i].trim().equals("")) answer++;
		}
        
        return answer;
    }
    // 더 줄임
//    public static int solution(String[] babbling) {
//        int answer = 0;
//        
//        String[] key = {"aya", "ye", "woo", "ma"};
//        
//        for (int i = 0; i < babbling.length; i++) {
//			for (String k : key) {
//				babbling[i] = babbling[i].replace(k, "");
//			}
//			if(babbling[i].trim().equals("")) answer++;
//		}
//        
//        return answer;
//    }
    
    //다른사람 방법
//    public static int solution(String[] babbling) {
//        int answer = 0;
//
//        for(int i =0; i < babbling.length; i++) {
//            babbling[i] = babbling[i].replace("aya", "1");
//            babbling[i] = babbling[i].replace("woo", "1");
//            babbling[i] = babbling[i].replace("ye", "1");
//            babbling[i] = babbling[i].replace("ma", "1");
//            babbling[i] = babbling[i].replace("1", "");
//            if(babbling[i].isEmpty()) {
//                answer = answer + 1;
//            }
//        }
//
//        return answer;
//    }

}
