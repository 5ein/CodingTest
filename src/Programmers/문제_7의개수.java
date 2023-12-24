package programmers;

public class 문제_7의개수 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		System.out.println(solution(array));
	}
	
    public static int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
			String s = String.valueOf(array[i]);
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '7') answer++;
			}
		}
        return answer;
    }
    
    //다른풀이
//    public static int solution(int[] array) {
//        int answer = 0;
//        for(int a : array){
//            while(a != 0){ //a > 0
//                if(a % 10 == 7){
//                    answer++;
//                }
//                a /= 10;
//            }
//        }
//        return answer;
//    }
    
//    public static int solution(int[] array) {
//        int svn = 0;
//        String str = "";
//
//        for(int i=0; i<array.length; i++){
//            str += array[i];
//        }
//
//        for(int i=0; i<str.length(); i++){
//            if(str.substring(i,i+1).equals("7")) svn++;
//        }
//
//        return svn;
//    }

}
