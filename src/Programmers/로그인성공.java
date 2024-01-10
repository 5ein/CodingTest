package programmers;

public class 로그인성공 {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(solution(id_pw, db));
	}
	
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (int i = 0; i < db.length; i++) {
			if(db[i][0].equals(id_pw[0])) {
				answer = "wrong pw";
				if(db[i][1].equals(id_pw[1])) answer = "login";
			}
		}
        
        return answer;
    }
    
//    public static String solution(String[] id_pw, String[][] db) {
//    	String answer = "fail";
//    	for (String[] s : db) {
//			if(s[0].equals(id_pw[0])) {
//				answer = "wrong pw";
//				if(s[1].equals(id_pw[1])) answer = "login";
//			}
//		}
//    	return answer;
//    }

}
