package programmers;

public class 치킨쿠폰 {

	public static void main(String[] args) {
		int chicken = 100;
		System.out.println(solution(chicken));
	}
	
    public static int solution(int chicken) {
    	int answer = 0;
        int coupon = chicken;

		while (coupon >= 10) {
			int leftCoupon = coupon % 10;
			answer += coupon / 10;
			coupon = leftCoupon + coupon / 10;
		}
        
        return answer;
    }

}
