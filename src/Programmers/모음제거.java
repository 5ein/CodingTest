package programmers;

public class 모음제거 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		String answer = "";
		
		char[] c = {'a', 'e', 'i', 'o', 'u'};
		
		for (int i = 0; i < my_string.length(); i++) {
			char r = my_string.charAt(i);
			
			boolean t = true;
			for (Character j : c) {
				if(j == r) {
					t = false;
					break;
				}
			}
			
			if(t == true) answer += r;
		}
		
		System.out.println(answer);
	}
	
	//다른사람 풀이
//	public static void main(String my_string) {
//        String answer = "";
//        //1.
//        answer = my_string.replaceAll("[aeiou]", "");
//        
//        //2.
//        answer = my_string.replaceAll("a|e|i|o|u", "");
//        
//        //3.
//        answer = my_string.replaceAll("[a,e,i,o,u]","");
//        
//        //4.
//        my_string = my_string.replace("a", "");
//        my_string = my_string.replace("e", "");
//        my_string = my_string.replace("i", "");
//        my_string = my_string.replace("o", "");
//        my_string = my_string.replace("u", "");
//        
//        System.out.println(answer);;
//    }

}
