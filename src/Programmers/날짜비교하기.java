package programmers;

public class 날짜비교하기 {

	public static void main(String[] args) {
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		System.out.println(solution(date1, date2));
	}
	
    public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        if(date1[0] < date2[0]) answer = 1;
        else if(date1[0] > date2[0]) answer = 0;
        else {
        	if(date1[1] < date2[1]) answer = 1;
        	else if(date1[1] > date2[1]) answer = 0;
        	else {
        		if(date1[2] < date2[2]) answer = 1;
        		else answer = 0;
        	}
        }
        
        return answer;
    }
    
    // 날짜 이기 때문에 로컬데이트 사용
//    public static int solution(int[] date1, int[] date2) {
//
//        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
//
//        if (dateA.isBefore(dateB)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
    
//    public static int solution(int[] date1, int[] date2) {
//        int answer = 0;
//
//        for(int i=0; i < date1.length; i++) {
//            if(date1[i] < date2[i]) {
//                answer = 1;
//                break;
//            }else if(date1[i] > date2[i]){
//                answer = 0;
//                break;
//            }
//        }
//
//        return answer;
//    }

}
