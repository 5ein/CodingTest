package programmers;

public class 정수찾기 {

	public static void main(String[] args) {
		int[] num_list = {15, 98, 23, 2, 15}; 
		int n = 20;
		System.out.println(solution(num_list, n));
	}
	
	public static int solution(int[] num_list, int n) {
		int answer = 0;
		
		for (int i : num_list) {
			if(i == n) {
				answer = 1;
				break;
			}
		}
		
		return answer;
	}
	
//    public static int solution(int[] num_list, int n) {
//        int answer = 0;
//        
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i : num_list) {
//			list.add(i);
//		}
//        
//        if(list.contains(n)) answer = 1;
//        
//        return answer;
//    }

}
