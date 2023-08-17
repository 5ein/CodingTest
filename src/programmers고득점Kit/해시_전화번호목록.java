package programmers고득점Kit;

import java.util.HashSet;

public class 해시_전화번호목록 {

	//해시로 풀기
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = true;
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < phone_book.length; i++) {
			set.add(phone_book[i]);
		}
		
		for (int i = 0; i < phone_book.length; i++) {
			int l = phone_book[i].length();
			for (int j = 1; j < l; j++) {
				if(set.contains(phone_book[i].substring(0, j))) {
				    answer = false;
				    break;
				}
			}
			
			if (answer == false) break;
		}
		
		System.out.println(answer);
	}
	
	//해시로 풀기 다른사람 코드
//	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		boolean answer = true;
//		
//		HashSet<String> set = new HashSet<String>();
//		 for (String phone : phone_book) {
//	            set.add(phone);
//	        }
//	        
//	        for (String phone : phone_book) {
//	            for (int i = 1; i < phone.length(); i++) {
//	                if (set.contains(phone.substring(0, i))) {
//	                    answer =  false;
//	                    break;
//	                }
//	            }
//	            if(answer = false) break;
//	        }
//	        
//		System.out.println(answer);
//	}
	
	//다른 방법
//	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		boolean answer = true;
//		
//		Arrays.sort(phone_book);
//		
//		for (int i = 0; i < phone_book.length - 1; i++) {
//			if (phone_book[i+1].startsWith(phone_book[i])) {
//				answer = false;
//				break;
//			}
//		}
//		
//		System.out.println(answer);
//	}

}
