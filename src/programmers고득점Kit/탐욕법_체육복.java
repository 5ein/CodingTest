package programmers고득점Kit;

import java.util.Arrays;
//import java.util.HashSet;

public class 탐욕법_체육복 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		//sort를 해주지 않으면 테스트케이스 13 14에서 오류가 난다
		Arrays.sort(lost); 
		Arrays.sort(reserve);
		
        int answer = n - lost.length;
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
		System.out.println(answer);
	}
	
	//HashSet사용하기
//	public static void main(String[] args) {
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
//		
//		//sort를 해주지 않으면 테스트케이스 13 14에서 오류가 난다
//		Arrays.sort(lost); 
//		Arrays.sort(reserve);
//		
//		HashSet<Integer> lostSet = new HashSet<>();
//		HashSet<Integer> reserveSet = new HashSet<>();
//		
//		for (int i : lost) {
//			lostSet.add(i);
//		}
//		
//		for (int i : reserve) {
//			if(lostSet.contains(i)) {
//				lostSet.remove(i);
//			} else {
//				reserveSet.add(i);
//			}
//		}
//		
//		for (int i : lost) {
//			if (lostSet.contains(i)) {
//				if (reserveSet.contains(i - 1)) {
//					lostSet.remove(i);
//					reserveSet.remove(i - 1);
//				} else if (reserveSet.contains(i + 1)) {
//					lostSet.remove(i);
//					reserveSet.remove(i + 1);
//				}
//			}
//			
//			if(lostSet.isEmpty()) {
//				break; // 더 이상 빌려줄 필요 없을 경우 반복문 종료
//			}
//		}
//		
//		int answer = n - lostSet.size();
//		System.out.println(answer);
//	}

}


