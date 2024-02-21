package programmers;

public class 크기가작은부분문자열 {

	public static void main(String[] args) {
		String t = "500220839878";
		String p = "7";
		
		System.out.println(solution(t, p));
	}
	
	//int로 하면 런타임에러, Long으로 함
    public static int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        int length = t.length() - pLength + 1;
        long longP = Long.parseLong(p);
        for (int i = 0; i < length; i++) {
			long longS = Long.parseLong(t.substring(i, i + pLength));
			if(longS <= longP) answer++;
		}
        return answer;
    }
    
    //다른사람 풀이
//    public int solution(String t, String p) {
//        int answer = 0;
//        long ip = Long.parseLong(p);
//        for(int i=0;i<=t.length()-p.length();i++){
//            if(Long.parseLong(t.substring(i,i+p.length()))<=ip){
//                answer++;
//            }
//        }
//        return answer;
//    }
    


}
