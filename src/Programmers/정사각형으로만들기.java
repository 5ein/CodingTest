package programmers;

public class 정사각형으로만들기 {

	public static void main(String[] args) {
		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		System.out.println(solution(arr));
	}
    public static int[][] solution(int[][] arr) {
    	int[][] answer = {};

    	int height = arr.length;
        int width = arr[0].length;
    	
        if(height > width) {
        	answer =  new int[height][height];
        }else {
        	answer = new int[width][width];
        }
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}
        
        return answer;
    }
    
    //다른사람 풀이
//    public static int[][] solution(int[][] arr) {
//        int max = Math.max(arr.length, arr[0].length);
//        int[][] array = new int[max][max];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
//        }
//        return array;
//    }
    
//    public static int[][] solution(int[][] arr) {
//        int max = arr.length > arr[0].length ?
//                                            arr.length : arr[0].length;
//        int[][] result = new int[max][max];
//        for(int i=0; i<arr.length; i++)
//                for(int j=0; j<arr[0].length; j++)
//                    result[i][j] = arr[i][j];
//        return result;
//    }
    
}
