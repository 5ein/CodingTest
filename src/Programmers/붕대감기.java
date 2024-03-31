package programmers;

public class 붕대감기 {

	public static void main(String[] args) {
		int[] bandage = {5, 1, 5};
		int health = 30;
		int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
		System.out.println(solution(bandage, health, attacks));
	}
	
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int attackIdx = 0;
        int heal = 0;
        for (int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
			if(i != attacks[attackIdx][0]) { //공격 받지 않았을 떄
				answer += bandage[1];
				heal++;
				if(heal == bandage[0]) { //추가 체력 
					answer += bandage[2];
					heal = 0;
				}
				if(answer > health) { //최대 체력을 넘었을 때
					answer = health;
				}
			} else { //공격을 받았을 때
				heal = 0; //연속성공시간 초기화
				answer -= attacks[attackIdx][1]; //체력 - 피해량
				attackIdx++;
				if(answer <= 0) return -1;
			}
		}
        
        return answer;
    }
    
    //다른사람 풀이1
//    public static int solution(int[] bandage, int health, int[][] attacks) {
//        int cnt = bandage[0]; // 추가 체력 기준
//        int now = health; // 현재 체력
//        int std = 0; // 마지막으로 공격당한 시간
//
//        int v1, v2; // 추가 체력 받을 수 있나?
//        for (int[] atk: attacks) {
//            if (now <= 0) {
//                return -1;
//            }
//
//            v1 = atk[0] - std - 1; // 시간 차이
//            v2 = v1 / cnt; // 추가 체력 회수
//
//            // 맞기 직전까지의 체력 정산
//            std = atk[0];
//            now = Math.min(health, now + (v1 * bandage[1]));
//            now = Math.min(health, now + (v2 * bandage[2]));
//
//            now -= atk[1];
//        }        
//
//        return now <= 0 ? -1 : now;
//    }
    
  //다른사람 풀이2
//    public static int solution(int[] bandage, int health, int[][] attacks) {
//        int maxHealth = health;
//        int maxTime = attacks[attacks.length-1][0];
//
//        int beforeTime = 0;
//        int bandageTime = 0;
//        for (int[] attack : attacks) {
//            bandageTime = attack[0] - beforeTime - 1;
//            health = Math.min(maxHealth, health + (bandage[1] * bandageTime));
//            if (bandageTime / bandage[0] > 0) {
//                health = Math.min(maxHealth, health + bandage[2] * (bandageTime / bandage[0]));
//            }
//
//            health -= attack[1];
//            beforeTime = attack[0];
//            if (health <= 0) return -1;
//        }
//
//        return health;
//    }

}
