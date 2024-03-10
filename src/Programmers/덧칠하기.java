package programmers;

public class 덧칠하기 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[] section = {1, 3};
		
		System.out.println(solution(n, m, section));
	}
	
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int start = section[0];
        int end = section[0] + (m - 1);
        
        for (int i : section) {
			if(i >= start && i <= end) continue;
			else {
				start = i;
				end = i + (m - 1);
				answer++;
			}
		}
        
        return answer;
    }
    
    //다른사람 코드
//    public static int solution(int n, int m, int[] section) {
//        int roller = section[0];
//        int cnt = 1;
//        for(int i = 1; i < section.length; i++) {
//            if(roller + m - 1 < section[i]) {
//                cnt++;
//                roller = section[i];
//            }
//        }
//        return cnt;
//    }

}
