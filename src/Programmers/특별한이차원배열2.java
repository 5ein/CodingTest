package programmers;

public class 특별한이차원배열2 {

	public static void main(String[] args) {
		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
		System.out.println(solution(arr));
	}
    public static int solution(int[][] arr) {
        int answer = 1;
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] != arr[j][i]) {
					answer = 0;
					break;
				}
			}
		}
        
        return answer;
    }

}
