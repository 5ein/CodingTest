package programmers;

public class 문제_2차원으로만들기 {
	
	public static void main(String[] args) {
		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n = 3;
		
		int[][] answer = solution(num_list, n);
		
//System.out.print는 여기서만 사용 하는 부분 코테에서는 return 이용하기 때문
	    System.out.print("[");
	    for (int i = 0; i < answer.length; i++) {
	        System.out.print("[");
	        for (int j = 0; j < answer[i].length; j++) {
	            System.out.print(answer[i][j]);
	            if (j < answer[i].length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.print("]");
	        if (i < answer.length - 1) {
	            System.out.print(", ");
	        } else {
	            System.out.println("]");
	        }
	    }
		
	}
	
	//코테 정답 부분은 아래 부분만 적으면 됨
	public static int[][] solution(int[] num_list, int n) {
        
        int m = num_list.length / n; //배열갯수
        int[][] answer = new int[m][n];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        
        return answer;
    }
	
	
	//다른사람 풀이
//	public static int[][] solution(int[] num_list, int n) {
//        int[][] answer = new int[num_list.length/n][n];
//	    int count = 0;
//	
//	    for (int i = 0; i < answer.length; i++) {
//	        for (int j = 0; j < answer[i].length; j++) {
//	            answer[i][j] = num_list[count];
//	            count++;
//	        }
//	    }
//	    return answer;
//    }
	    
}
