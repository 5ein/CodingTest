package programmers;

import java.util.ArrayList;

public class 다트게임 {

	public static void main(String[] args) {
//		String dartResult = "1S*2T*3S";
		String dartResult = "1D2S#10S";
		
		System.out.println(solution(dartResult));
	}
	
    public static int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        char[] arr = dartResult.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] >= '0' && arr[i] <= '9') {
        		if(arr[i + 1] >= '0' && arr[i + 1] <= '9') {
        			int n = Integer.parseInt(dartResult.substring(i, i + 2));
        			list.add(n);
        			i++;
        		} else {
        			list.add(Integer.parseInt(arr[i] + ""));
        		}
        		idx++;
			} else if(arr[i] == 'S') {
				continue;
			} else if(arr[i] == 'D') {
				int n = list.get(idx - 1);
				list.set(idx - 1, n * n);
			} else if(arr[i] == 'T') {
				int n = list.get(idx - 1);
				list.set(idx - 1, n * n * n);
			} else if(arr[i] == '*') {
				if(idx >= 2) {
					int n1 = list.get(idx - 1);
					int n2 = list.get(idx - 2);
					list.set(idx - 1, n1 * 2);
					list.set(idx - 2, n2 * 2);
				} else {
					int n = list.get(idx - 1);
					list.set(idx - 1, n * 2);
				}
			} else if(arr[i] == '#') {
				int n = list.get(idx - 1);
				list.set(idx - 1, (-1) * n);
			}
		}
        
        for (int i : list) {
			answer += i;
		}
        
        return answer;
    }
    
    // 방법1 : Character.isDigit() 을 이용해서 숫자인지 확인
//    public static int solution(String dartResult) {
//    	 int answer = 0;
//    	    ArrayList<Integer> list = new ArrayList<>();
//    	    int idx = 0;
//    	    char[] arr = dartResult.toCharArray();
//    	    for (int i = 0; i < arr.length; i++) {
//    	        if (Character.isDigit(arr[i])) { // 숫자인 경우
//    	            int num;
//    	            if (Character.isDigit(arr[i + 1])) { // 다음 문자도 숫자이면 두 자리 수
//    	                num = Integer.parseInt(dartResult.substring(i, i + 2));
//    	                i++; // 다음 인덱스로 이동
//    	            } else {
//    	                num = Character.getNumericValue(arr[i]);
//    	            }
//    	            list.add(num);
//    	            idx++;
//    	        } else if (arr[i] == 'S' || arr[i] == 'D' || arr[i] == 'T') { // 보너스 처리
//    	            int n = list.get(idx - 1);
//    	            if (arr[i] == 'D') list.set(idx - 1, n * n); // 제곱
//    	            else if (arr[i] == 'T') list.set(idx - 1, n * n * n); // 세제곱
//    	        } else if (arr[i] == '*') { // 스타상 처리
//    	            if (idx >= 2) {
//    	                int n1 = list.get(idx - 1);
//    	                int n2 = list.get(idx - 2);
//    	                list.set(idx - 1, n1 * 2);
//    	                list.set(idx - 2, n2 * 2);
//    	            } else if (idx == 1) {
//    	                int n = list.get(idx - 1);
//    	                list.set(idx - 1, n * 2);
//    	            }
//    	        } else if (arr[i] == '#') { // 아차상 처리
//    	            int n = list.get(idx - 1);
//    	            list.set(idx - 1, (-1) * n);
//    	        }
//    	    }
//
//    	    for (int i : list) {
//    	        answer += i;
//    	    }
//
//    	    return answer;
//    }
    
    // 방법2 :  배열사용
//    public static int solution(String dartResult) {
//        int answer = 0;
//        int[] dart = new int[3];
//
//        int n = 0,idx = 0;
//        String numstr = "";
//        
//        for(int i=0;i<dartResult.length();i++){
//            char c = dartResult.charAt(i);
//            
//            //숫자일 때
//            if(c >= '0' && c <= '9'){       
//                 numstr += String.valueOf(c);
//                
//            }
//            //보너스일 때
//            else if(c == 'S' || c == 'D' || c == 'T'){
//                n = Integer.parseInt(numstr);
//               if(c == 'S'){
//                   dart[idx++] = (int)Math.pow(n,1);
//                 }
//                else if(c == 'D'){
//                    dart[idx++] = (int)Math.pow(n,2);
//                }
//                else{
//                    dart[idx++] = (int)Math.pow(n,3);
//                } 
//                numstr="";
//            }
//            //옵션일 때
//            else {
//                if(c == '*'){
//                    dart[idx-1]*=2;
//                    if(idx - 2 >= 0) dart[idx-2]*=2; 
//                }
//                else {
//                dart[idx-1] *= (-1);
//                }
//            }
//        }
//    
//        answer = dart[0]+dart[1]+dart[2];
//        return answer;
//    }
    
    // 방법3 : stack 이용
//    public static int solution(String dartResult) {
//        Stack<Integer> stack = new Stack<>();
//        int sum = 0;
//        for (int i = 0; i < dartResult.length(); ++i) {
//            char c = dartResult.charAt(i);
//            if (Character.isDigit(c)) {
//                sum = (c - '0');
//                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
//                    sum = 10;
//                    i++;
//                }
//                stack.push(sum);
//            } else {
//                int prev = stack.pop();
//                if (c == 'D') {
//                    prev *= prev;
//                } else if (c == 'T') {
//                    prev = prev * prev * prev;
//                } else if (c == '*') {
//                    if (!stack.isEmpty()) {
//                        int val = stack.pop() * 2;
//                        stack.push(val);
//                    }
//                    prev *= 2;
//                } else if (c == '#') {
//                    prev *= (-1);
//                }
//                // System.out.println(prev);
//                stack.push(prev);
//            }
//        }
//        int totalScore = 0;
//        while (!stack.isEmpty()) {
//            totalScore += stack.pop();
//        }
//        return totalScore;
//    }

}
