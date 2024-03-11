package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 실패율 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(solution(N, stages));
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int user = stages.length;
        double[] failRate = new double[N];
        HashMap<Integer, Integer> fail = new HashMap<>();
		
        //각 스테이지별 머무르고 있는 사람 수를 HashMap으로 나타낸다
        //stages = [2, 1, 2, 6, 2, 4, 3, 3] 일때
        //fail = {1=1, 2=3, 3=2, 4=1, 5=0}
        //N+1은 마지막 스테이지까지 클리어한 사용자이므로
        //for문은 스테이지 1부터 N까지 반복
        for (int i = 1; i <= N; i++) {
            fail.put(i, count(stages, i));
        }

		//스테이지마다의 실패율을 계산
        int idx = 0;
        for (Integer key : fail.keySet()) {
            failRate[idx++] = (double) fail.get(key) / user;
            //stages = [1, 1, 1, 1]일때 처럼
            //fail = {1=4, 2=0}이 되는데
            //실패율을 구할때 N에 해당하는 스테이지에
            //머무르고 있는 사람이 0이면 분모가 0이 되므로
            //예외발생 방지를 위해 분모를 1로 설정
            if (user == fail.get(key))
                user = 1;
            else
                user -= fail.get(key);
        }
		
        //실패율을 내림차순으로 정렬하기 위한 배열 생성
        Double[] temp = new Double[N];
        for (int i = 0; i < N; i++) {
            temp[i] = failRate[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());

		//실패율에 따라 스테이지를 내림차순으로 정렬
		//새로 만든 배열과 기존 fail배열의 원소의 값이 같을때
        //answer 배열에
        //fail의 원소의 인덱스 + 1에 해당하는 수(스테이지)를
        //temp배열의 인덱스 위치에 할당
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (failRate[i] == temp[j]) {
                	//answer에 이미 다른 수가 할당 됐을때
                    //continue를 이용해서
                    //계속해서 배열이 업데이트 됨을 방지
                    if (answer[j] != 0)
                        continue;
                    answer[j] = i+1;
                    //실패율이 동일한 스테이지를 구분하기 위해
                    //break를 이용해서
                    //안쪽 for문의 반복을 중지       
                    break;
                }
            }
        }

        return answer;
    }
	//배열에서 중복되는 정수값을 카운트하기 위한 메서드
    public static int count(int[] arr, int n) {
        int cnt = 0;

        for (int i : arr) {
            if (i == n)
                cnt++;
        }
        return cnt;
    }
	
    //2번 풀이
//    public static int[] solution(int N, int[] stages) {
//        int[] answer = {};
//        
//        int[] noClear = new int[N + 1]; //스테이지에 도달후 클리어 못함
//        int[] yesClear = new int[N + 1]; //스테이지에 도달한 사람 수
//        for (int i = 0; i < stages.length; i++) {
//        	for (int j = 0; j < stages[i]; j++) { //스테이지에 도달한 플레이어 수 증가
//				yesClear[j]++;
//			}
//        	noClear[stages[i] - 1]++; //스테이지 도달했으나 클리어 못한 플레이어 수 증가
//		}
//        
//        Map<Integer, Double> map = new HashMap<>(); //스테이지 번호와 실패율 저장 할 map
//        
//        for (int i = 0; i < N; i++) {
//			if(yesClear[i] == 0 || yesClear[i] == 0) { //도달한 사람이 없거나, 클리어한 사람이 없는 경우
//				map.put(i + 1, 0.0);
//			} else { //실패율 계산하여 맵에 저장
//				map.put(i + 1, (double)noClear[i] / (double)yesClear[i]);
//			}
//		}
//        List<Integer> list = new ArrayList<>(map.keySet());
//        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1))); //실패율을 기준으로 내림차순 정렬
//        
//        answer = list.stream().mapToInt(i -> i).toArray(); //리스트를 배열로 변환하여 반환
//        
//        return answer;
//    }
    
    //3번 풀이
//    public static int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//        float[] result = new float[N];
//
//        for(int i = 0 ; i < N; i++) {
//            float unclear = 0;
//            float clear = 0;
//
//            for(int stage : stages) {
//                if(stage == i+1) {
//                    unclear++;   
//                    clear++;
//                } else if(stage > i+1) {
//                    clear++;
//                }
//            }    
//
//            if(clear != 0) 
//                result[i] = unclear/clear;
//            else
//                result[i] = 0;
//        }
//
//      for(float res : result) {
//            System.out.println(res);
//        }
//
//        for(int i = 0; i < N ; i++) {
//            float maxValue = result[0];
//            int maxIndex = 0;
//
//            for(int j = 0; j < N; j++) {
//                if(maxValue < result[j]) {
//                    maxIndex = j;
//                    maxValue = result[j];
//                } 
//            }
//            result[maxIndex] = -1;
//            answer[i] = maxIndex + 1;
//        }
//
//        // for(float res : result) {
//        //     System.out.println(res);
//        // }
//
//        for(int ans : answer) {
//            System.out.println(ans);
//        }
//
//        return answer;
//    }

}
