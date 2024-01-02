package programmers;

public class 외계어사전 {

	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		System.out.println(solution(spell, dic));
	}
	
//    public static int solution(String[] spell, String[] dic) {
//        int answer = 2;
//        
//        for (int i = 0; i < dic.length; i++) {
//        	int length = dic[i].length();
//        	int count = 0;
//			for (int j = 0; j < spell.length; j++) {
//				if(dic[i].length() == spell.length) {
//					if(dic[i].contains(spell[j])) count++;
//					else break;
//				}
//			}
//			if(length == count) {
//				answer = 1;
//				break;
//			}
//		}
//        
//        return answer;
//    }
    
    public static int solution(String[] spell, String[] dic) {
    	for (String s : dic) {
			int count = 0;
			for (String s2 : spell) {
				if(s.contains(s2)) count++;
			}
			if(count == spell.length) return 1;
		}
    	return 2;
    }

}
