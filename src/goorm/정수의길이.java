package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 정수의길이 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		
		System.out.println(input.length());
	}

}
