package programmers;

public class 기사단원의무기 {

	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
		System.out.println(solution(number, limit, power));
	}
	
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
			int cnt = 0;
			for (int j = 1; j * j <= i; j++) {
				if(j * j == i) cnt++;
				else if(i % j == 0) cnt += 2;
			}
			
			if(cnt > limit) cnt = power;
			answer += cnt;
		}
        
        return answer;
    }
    
    //다른사람 풀이1
//    public static int solution(int number, int limit, int power) {
//        int[] count = new int[number + 1];    
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number / i; j++) {
//                count[i * j]++;
//            }
//        }
//        int answer = 0;
//        for (int i = 1; i <= number; i++) {
//            if (count[i] > limit) {
//                answer += power;
//            } else {
//                answer += count[i];
//            }
//        }
//        return answer;
//    }
    
    //다른사람 풀이2
//    public static int solution(int number, int limit, int power) {
//        int answer = 0;
//        for(int i=1; i<=number; i++){
//            int a = count(i);
//            if(a>limit){
//                answer += power;
//            }else{
//                answer += a;
//            }
//        }
//        return answer;
//    }
//    public static int count(int N){
//        int count = 0;
//        for (int i = 1; i * i <= N; i++) {
//            if (i * i == N) count++;
//            else if (N % i == 0) count += 2;
//        }
//        return count;
//    }

}
