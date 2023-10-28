package programmers;

public class 문자열바꿔서찾기 {

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		System.out.println(solution(myString, pat));
	}
	
//    public static int solution(String myString, String pat) {
//        int answer = 0;
//        String mystr = "";
//        for (int i = 0; i < myString.length(); i++) {
//        	if(myString.charAt(i) == 'A') {
//        		mystr += 'B';
//        	}else {
//        		mystr += 'A';
//        	}
//		}
//        
//        if (mystr.contains(pat)) answer = 1;
//        
//        return answer;
//    }
    
//    public static int solution(String myString, String pat) {
//    	int answer = 0;
//    	
//    	String mystr = myString.replace("A", "b");
//    	mystr = mystr.replace("B", "A");
//    	mystr = mystr.replace("b", "B");
//    	
//    	if (mystr.contains(pat)) answer = 1;
//    	
//    	return answer;
//    }
    
    public static int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }

}
