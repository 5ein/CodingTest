package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class no_1620 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] nameArr = new String[n + 1];
		
		for (int i = 1; i <= n; i++) {
			String name = sc.nextLine();
			map.put(name, i);
			nameArr[i] = name;
		}
		
		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			if(isStringNumber(s)) {
				int index = Integer.parseInt(s);
				sb.append(nameArr[index]);
			} else {
				sb.append(map.get(s));
			}
			sb.append("\n");
		}
		sc.close();
		
		System.out.println(sb.toString());
	}
	
	public static boolean isStringNumber(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
