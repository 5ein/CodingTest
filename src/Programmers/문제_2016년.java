package programmers;

public class 문제_2016년 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
	}
	
	public static String solution(int a, int b) {
		String answer = "";
		//2016년 1월 1일은 금요일
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int allday = 0;
		for (int i = 0; i < a - 1; i++) {
			allday += date[i];
		}
		allday += (b - 1);
		answer = day[allday % 7];
		return answer;
	}
    
    //다른사람 풀이
//	public static String solution(int a, int b) {
//		String answer = "";
//		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a - 1, b).build();
//		answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
//		return answer;
//	}
//
//	public static String solution(int a, int b) {
//		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
//	}
    

}
