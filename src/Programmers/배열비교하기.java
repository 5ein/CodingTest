package programmers;

public class 배열비교하기 {

	public static void main(String[] args) {
		int[] arr1 = {100, 17, 84, 1};
		int[] arr2 = {55, 12, 65, 36};
		System.out.println(solution(arr1, arr2));
	}
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length > arr2.length) {
        	answer = 1;
        }else if(arr1.length < arr2.length) {
        	answer = -1;
        }else {
        	int a = 0;
        	int b = 0;
        	for (int i = 0; i < arr2.length; i++) {
				a += arr1[i];
				b += arr2[i];
			}
        	if(a > b) answer = 1;
        	else if(a < b) answer = -1;
        }
        
        return answer;
    }
    
    //댜른사람 풀이 
//    public static int solution(int[] arr1, int[] arr2) {
//        int answer = Integer.compare(arr1.length, arr2.length);
//
//        if(answer == 0) {
//            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
//        }
//
//        return answer;
//    }

}
