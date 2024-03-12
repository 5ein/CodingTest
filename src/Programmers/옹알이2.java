package programmers;

public class 옹알이2 {

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		
		System.out.println(solution(babbling));
	}
	
    public static int solution(String[] babbling) {
    	int answer = 0;
    	
    	String[] str = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
        	for (int j = 0; j < str.length; j++) {
        		if(babbling[i].contains(str[j] + str[j])) break;
        		else babbling[i] = babbling[i].replace(str[j], " ");
			}
        	babbling[i] = babbling[i].replace(" ", "");
        	if(babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
    
    //다른사람 풀이 1 
//    public static int solution(String[] babbling) {
//        int answer = 0;
//        for(int i=0; i<babbling.length; i++){
//            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama","1");
//            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma"," ");
//            babbling[i] = babbling[i].replaceAll(" ","");
//            if(babbling[i].equals("")) answer++;
//        }
//        return answer;
//    }
    
    //다른사람 풀이 2
//    public static int solution(String[] babbling) {
//        int answer = 0;
//        for(String str:babbling){
//            if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama"))
//                continue;
//            if(str.replace("aya", "1").replace("ye", "1").replace("woo", "1").replace("ma", "1").replace("1", "").length() == 0)
//                answer++;
//        }
//        return answer;
//    }
    
    //다른사람 풀이 3
//    public static int solution(String[] babblings) {
//        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
//        int answer = 0;
//        for(int i = 0; i < babblings.length; i++) {
//            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
//                continue;
//            }
//
//            babblings[i] = babblings[i].replace("aya", " ");
//            babblings[i] = babblings[i].replace("ye", " ");
//            babblings[i] = babblings[i].replace("woo", " ");
//            babblings[i] = babblings[i].replace("ma", " ");
//            babblings[i] = babblings[i].replace(" ", "");
//
//            if(babblings[i].length()  == 0) answer++;
//
//        }
//        return answer;
//    }
}
