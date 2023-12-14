package programmers;

import java.util.HashMap;

public class 영어가싫어요 {

	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		System.out.println(solution(numbers));
	}
	
    public static long solution(String numbers) {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("zero", "0");
        map.put("one", "1");
    	map.put("two", "2");
    	map.put("three", "3");
    	map.put("four", "4");
    	map.put("five", "5");
    	map.put("six", "6");
    	map.put("seven", "7");
    	map.put("eight", "8");
    	map.put("nine", "9");
        
    	for (String s : map.keySet()) {
			if(numbers.contains(s)) {
				numbers = numbers.replaceAll(s, map.get(s));
			}
		}
    	
    	long answer = Long.parseLong(numbers);
        
        return answer;
    }
    
    //다른사람 풀이
//    private static final Map<String, Integer> CONTAINS = Map.of("zero", 0, "one", 1, "two", 2,"three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
//    public long solution(String numbers) {
//        StringBuilder answer = new StringBuilder();
//        StringBuilder builder = new StringBuilder();
//        for (String s : numbers.split("")) {
//            builder.append(s);
//            if (CONTAINS.containsKey(builder.toString())) {
//                answer.append(CONTAINS.get(builder.toString()));
//                builder = new StringBuilder();
//            }
//        }
//        return Long.parseLong(answer.toString());
//    }
    
    
//    public static long solution(String numbers) {
//        Map<String, String> map = new HashMap<>();
//        map.put("zero" , "0"); map.put("one"  , "1"); map.put("two"  , "2"); map.put("three", "3"); 
//        map.put("four" , "4"); map.put("five" , "5"); map.put("six"  , "6"); map.put("seven", "7"); 
//        map.put("eight", "8"); map.put("nine" , "9");
//
//        for(String x : map.keySet()) 
//            numbers = numbers.replace(x, map.get(x));
//
//        return Long.parseLong(numbers);
//    }

}
