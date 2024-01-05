package programmers;

public class 겹치는선분의길이 {

	public static void main(String[] args) {
		int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
		System.out.println(solution(lines));
	}
	
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201]; 
        for (int[] i : lines) {
			int start = i[0] + 100; //음수 + 양수를 count에 표현하기 위해서 +100함
			int end = i[1] + 100;
			for (int j = start; j < end; j++) {
				count[j]++;
			}
		}
		
        for (int i : count) {
			if(i > 1) answer++;
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int solution(int[][] lines) {
//        List<Integer> overLap = new ArrayList<>();
//        int cnt = 0;
//
//        for(int i = 0; i <= 2; i++){
//            int s = lines[i][0]>lines[i][1]?lines[i][1]:lines[i][0];
//            int b = lines[i][0]>lines[i][1]?lines[i][0]:lines[i][1];  
//            for(int j = s; j < b; j++){
//                if(overLap.contains(j)){
//                    overLap.remove(Integer.valueOf(j));
//                    cnt++;
//                    } else overLap.add(j);
//                }
//            }
//        return cnt;
//    }

}
