package doit;

import java.util.Random;

public class 연습02_01 {

	public static void main(String[] args) {
		Random r = new Random();

		System.out.println("키의 최댓값을 구합니다.");
		int num = 1 + r.nextInt(20); // 사람 수를 1 ~ 20
		System.out.println("사람 수는 " + num + "명입니다.");

		int[] height = new int[num];

		System.out.println("키는 다음과 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + r.nextInt(90); // 요솟값을 난수로 결정
			System.out.println("height[" + i + "] : " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");

	}

	// --- 배열 a의 최댓값을 구하여 반환 ---//
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

}
