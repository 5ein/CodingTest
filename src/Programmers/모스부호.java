package programmers;

import java.util.HashMap;

public class 모스부호 {
	
	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---";
		String answer = "";
		
		HashMap<String, String> morse = new HashMap<>();
		morse.put(".-", "a"); morse.put("-...", "b"); morse.put("-.-.", "c");
		morse.put("-..", "d"); morse.put(".", "e");	morse.put("..-.", "f");
		morse.put("--.", "g"); morse.put("....", "h"); morse.put("..", "i");
		morse.put(".---", "j"); morse.put("-.-", "k"); morse.put(".-..", "l");
		morse.put("--", "m"); morse.put("-.", "n"); morse.put("---", "o");
		morse.put(".--.", "p"); morse.put("--.-", "q"); morse.put(".-.", "r");
		morse.put("...", "s"); morse.put("-", "t"); morse.put("..-", "u");
		morse.put("...-", "v"); morse.put(".--", "w"); morse.put("-..-", "x");
		morse.put("-.--", "y");	morse.put("--..", "z");
		
		String[] s = letter.split(" ");
		for (int i = 0; i < s.length; i++) {
			answer += morse.get(s[i]);
		}
		
		System.out.println(answer);
	}
	
	//다른 방법
//	public static void main(String[] args) {
//		String letter = ".... . .-.. .-.. ---";
//		String answer = "";
//		
//		String[] morse = { 
//			    ".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f",
//			    "--.","g","....","h","..","i",".---","j","-.-","k",".-..","l",
//			    "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
//			    "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
//			    "-.--","y","--..","z"
//			};
//		
//		String[] s = letter.split(" ");
//		for (String i : s) {
//			for (int j = 0; j < morse.length - 1; j += 2) {
//				if(i.equals(morse[j])) {
//					answer += morse[j + 1];
//					break;
//				}
//			}
//		}
//		
//		System.out.println(answer);
//	}
	
}
