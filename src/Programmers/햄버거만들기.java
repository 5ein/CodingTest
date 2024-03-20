package programmers;

import java.util.Stack;

public class 햄버거만들기 {

	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		System.out.println(solution(ingredient));
	}
	
//    public static int solution(int[] ingredient) {
//		int answer = 0;
//		List<Integer> li = new ArrayList<>();
//
//		for (int i : ingredient) {
//			li.add(i);
//			while (li.size() >= 4) {
//				int n = li.size();
//				if (!(li.get(n - 1) == 1 && li.get(n - 2) == 3 && li.get(n - 3) == 2 && li.get(n - 4) == 1))
//					break;
//				for (int j = 0; j < 4; j++) {
//					li.remove(li.size() - 1);
//				}
//				answer++;
//			}
//		}
//		return answer;
//    }
    
    public static int solution(int[] ingredient) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int in : ingredient) {
			stack.push(in);
			if (stack.size() >= 4) {
				int size = stack.size();
				if(stack.get(size - 1) == 1
						&& stack.get(size - 2) == 3
						&& stack.get(size - 3) == 2
						&& stack.get(size - 4) == 1) {
					result++;
					for (int i = 0; i < 4; i++) {
						stack.pop();
					}
				}
			}
		}
		return result;
	}
    
//    public static int solution(int[] ingredient) {
//        int[] stack = new int[ingredient.length];
//        int sp = 0;
//        int answer = 0;
//        for (int i : ingredient) {
//            stack[sp++] = i;
//            if (sp >= 4 && stack[sp - 1] == 1
//                && stack[sp - 2] == 3
//                && stack[sp - 3] == 2
//                && stack[sp - 4] == 1) {
//                sp -= 4;
//                answer++;
//            }
//        }
//        return answer;
//    }

}
