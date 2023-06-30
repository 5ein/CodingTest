package baekjoon;

import java.util.Scanner;

public class no_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0; //그룹 단어 개수
		
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			boolean[] check = new boolean[26]; //알파벳
			boolean tmp = true; //그룹단어 유무
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j) - 'a';
				if(check[index]) { //이전에 사용한적 있는 문자
					if(S.charAt(j) != S.charAt(j-1)) { //이전문자와 연속되지 않음.
						tmp = false; //그룹단어가 아님.
						break;
					}
				}else { //이전에 사용한적 없는 문자
					check[index] = true; //문자 사용 체크
				}
			}
			
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
