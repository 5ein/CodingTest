package programmers;

public class 문제_3진법뒤집기 {
	
	public static void main(String[] arg) {
		int n = 125;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n, 3);
        String change = "";
        	for (int i = three.length() - 1; i >= 0; i--) {
				change += three.charAt(i);
			}
    	answer = Integer.parseInt(change, 3);
        return answer;
    }
    
//    public static int solution(int n) {
//        String a = "";
//        while(n > 0){
//            a = (n % 3) + a;
//            n /= 3;
//        }
//        a = new StringBuilder(a).reverse().toString();
//        return Integer.parseInt(a,3);
//    }
	
}
