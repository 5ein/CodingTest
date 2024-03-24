package programmers;

public class 신규아이디추천 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		System.out.println(solution(new_id));
	}
	
    public static String solution(String new_id) {
    	String answer = "";
        String s = new_id;

        // 1단계: 소문자 변환
        s = new_id.toLowerCase(); 

        // 2단계: 특수문자 제거
        for (char c : s.toCharArray()) { 
            if((c >= 48 && c <= 57) || (c >= 97 && c <= 122) || c == 45 || c == 46 || c == 95) {
                answer += c;
            }
        }
        s = answer;

        // 3단계: 연속된 마침표 치환
        while(s.contains("..")) { 
            s = s.replace("..", ".");
        }

        // 4단계: 처음과 끝의 마침표 제거
        while(s.startsWith(".")) s = s.substring(1);
        while(s.endsWith(".")) s = s.substring(0, s.length() - 1);

        // 5단계: 빈 문자열일 경우 "a" 대입
        if(s.isEmpty()) s = "a";

        // 6단계: 문자열 길이 16 이상일 때 처리
        if(s.length() >= 16) {
            s = s.substring(0, 15);
            if(s.endsWith(".")) s = s.substring(0, 14);
        }

        // 7단계: 문자열 길이 2 이하일 경우 처리
        while(s.length() <= 2) {
            s += s.charAt(s.length() - 1);
        }
        
        answer = s; // 수정된 문자열을 변수에 저장

        return answer; // 수정된 문자열 반환
    }
    
    //다른사람 풀이1
//    public static String solution(String new_id) {
//        String answer = "";
//        String temp = new_id.toLowerCase();
//
//        temp = temp.replaceAll("[^-_.a-z0-9]","");
//        System.out.println(temp);
//        temp = temp.replaceAll("[.]{2,}",".");
//        temp = temp.replaceAll("^[.]|[.]$","");
//        if(temp.equals(""))
//            temp += "a";
//        if(temp.length() >= 16){
//            temp = temp.substring(0,15);
//            temp = temp.replaceAll("^[.]|[.]$","");
//        }
//        if(temp.length() <= 2)
//            while(temp.length() < 3)
//                temp += temp.charAt(temp.length()-1);
//
//        answer = temp;
//        return answer;
//    }
    
    //다른사람 풀이2
//    public static String solution(String new_id) {
//        String answer = "";
//        
//        answer = new_id.toLowerCase(); //1
//        
//        answer = answer.replaceAll("[^0-9a-z-_.]", ""); //2
//        
//        answer = answer.replaceAll("\\.{2,}", "."); //3
//        
//        answer = answer.replaceAll("^[.]|[.]$", ""); //4
//       
//        answer = answer.equals("") ? "a" : answer; //5
//       
//        answer = answer.length() >= 16 ? answer.substring(0, 15) : answer; //6-1
//       
//        answer = answer.replaceAll("[.]$", ""); //6-2
//        
//        char lastCh = answer.charAt(answer.length() - 1); //7
//        if (answer.length() <= 2) {
//            while (answer.length() < 3) {
//                answer += lastCh;
//            }
//        }
//
//        return answer;
//    }
    
    //다른사람 풀이3
//    public static String solution(String new_id) {
//
//        String s = new KAKAOID(new_id)
//                .replaceToLowerCase()
//                .filter()
//                .toSingleDot()
//                .noStartEndDot()
//                .noBlank()
//                .noGreaterThan16()
//                .noLessThan2()
//                .getResult();
//
//
//        return s;
//    }
//
//    private static class KAKAOID {
//        private String s;
//
//        KAKAOID(String s) {
//            this.s = s;
//        }
    
//        private KAKAOID replaceToLowerCase() {
//            s = s.toLowerCase();
//            return this;
//        }
    
//        private KAKAOID filter() {
//            s = s.replaceAll("[^a-z0-9._-]", "");
//            return this;
//        }
    
//        private KAKAOID toSingleDot() {
//            s = s.replaceAll("[.]{2,}", ".");
//            return this;
//        }
    
//        private KAKAOID noStartEndDot() {
//            s = s.replaceAll("^[.]|[.]$", "");
//            return this;
//        }
    
//        private KAKAOID noBlank() {
//            s = s.isEmpty() ? "a" : s;
//            return this;
//        }
    
//        private KAKAOID noGreaterThan16() {
//            if (s.length() >= 16) {
//                s = s.substring(0, 15);
//            }
//            s = s.replaceAll("[.]$", "");
//            return this;
//        }
    
//        private KAKAOID noLessThan2() {
//            StringBuilder sBuilder = new StringBuilder(s);
//            while (sBuilder.length() <= 2) {
//                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
//            }
//            s = sBuilder.toString();
//            return this;
//        }
    
//        private String getResult() {
//            return s;
//        }
//    }

}
