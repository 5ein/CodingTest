package programmers;

public class 커피심부름 {

	public static void main(String[] args) {
		String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		System.out.println(solution(order));
	}
	
//    public static int solution(String[] order) {
//        int answer = 0;
//        
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("iceamericano", 4500);
//        map.put("americanoice", 4500);
//        map.put("hotamericano", 4500);
//        map.put("americanohot", 4500);
//        map.put("americano", 4500);
//        map.put("anything", 4500);
//        
//        map.put("icecafelatte", 5000);
//        map.put("cafelatteice", 5000);
//        map.put("hotcafelatte", 5000);
//        map.put("cafelattehot", 5000);
//        map.put("cafelatte", 5000);
//        
//        for (String s : order) {
//			answer += map.get(s);
//		}
//        
//        return answer;
//    }
    
    public static int solution(String[] order) {
    	int answer = 0;
    	
    	for (String s : order) {
    		if(s.contains("cafelatte")) answer += 5000;
    		else answer += 4500;
    	}
    	
    	return answer;
    }

}
