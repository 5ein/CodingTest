package programmers;

public class 콜라문제 {

	public static void main(String[] args) {
		int a = 2; //마트에 주어야 하는 병 수
		int b = 1; //마트가 주는 콜라 병 수
		int n = 20; //상빈이가 가지고 있는 빈 병의 개수
		System.out.println(solution(a, b, n));
	}
	
//    public static int solution(int a, int b, int n) {
//        int answer = 0;
//        int emptyCola = n;
//        while(emptyCola >= a) {
//        	int newCola = emptyCola / a;
//        	answer += newCola * b;
//        	emptyCola = newCola * b + (emptyCola % a);
//        }
//        return answer;
//    }
    
    //위 코드에 int 새로 만들지 않고 풀는것
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }

        return answer;
    }
    
    // 다른사람 풀이
//    public static int solution(int a, int b, int n) {
//        return (n - b) / (a - b) * b;
//    }
    

}
