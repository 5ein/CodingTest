package programmers;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 12;
		System.out.println(solution(x));
	}
	
    public static boolean solution(int x) {
        boolean answer = true;
        String[] s = String.valueOf(x).split("");
        int tmp = 0;
        for (int i = 0; i < s.length; i++) {
			tmp += Integer.parseInt(s[i]);
		}
        if(x % tmp != 0) answer = false;
        return answer;
    }

}
