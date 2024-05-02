package goorm;

import java.util.*;
import java.io.*;

public class 앵무새꼬꼬 {
	public static void main(String[] args) throws Exception {
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a'); arr.add('A'); 
		arr.add('e'); arr.add('E');
		arr.add('i'); arr.add('I');
		arr.add('o'); arr.add('O');
		arr.add('u'); arr.add('U');
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String answer = "";
			for (int j = 0; j < s.length(); j++) {
				if(arr.contains(s.charAt(j))) answer += s.charAt(j);
			}
			if(answer.isEmpty()) answer += "???";
			System.out.println(answer);
		}
		br.close();
	}
}
