package programmers;

public class k의개수 {

	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		int k = 5;
		System.out.println(solution(i, j, k));
	}
	
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
			String s[] = String.valueOf(l).split("");
			for (int m = 0; m < s.length; m++) {
				if(s[m].equals(strK)) answer++;
			}
		}
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(int i, int j, int k) {
//        String str = "";
//        for(int a = i; a <= j; a++) {
//            str += a+"";
//        }
//
//        return str.length() - str.replace(k+"", "").length();
//    }

}
