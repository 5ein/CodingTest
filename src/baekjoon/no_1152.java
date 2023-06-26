package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1152 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String[] S = sc.nextLine().split(" ");
//		int length = S.length;
//		if(S.length != 0 && S[0].equals("")) {
//			length -= 1;
//		}
//		System.out.println(length);
//		
//		sc.close();
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] S = br.readLine().split(" ");
		int length = S.length;
		if(S.length != 0 && S[0].equals("")) {
			length -= 1;
		}
		System.out.println(length);
		
		br.close();
	}

}
