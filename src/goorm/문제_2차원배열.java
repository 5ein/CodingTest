package goorm;

public class 문제_2차원배열 {
	
	public static void main(String[] args) throws Exception{
		// 4 * 4 크기의 2차원 배열을 선언합니다.
		int[][] matrix = new int[4][4];
		// 2차원 배열 반복문으로 선언하기
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if(j != matrix.length - 1) System.out.print(", ");
			}
			System.out.println("]");
		}
		System.out.println();
		
		// 2차원 배열에 접근하여 값 변환
		// index는 항상 0부터 시작
		matrix[1][2] = 1;
		matrix[3][0] = 2;
		
		// 3번째 칸의 세로 1줄을 변경
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][2] = 4;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if(j != matrix.length - 1) System.out.print(", ");
			}
			System.out.println("]");
		}
		System.out.println();
		
		// 4번째 가로 줄 모두 변경
		for (int i = 0; i < matrix.length; i++) {
			matrix[3][i] = 5;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if(j != matrix.length - 1) System.out.print(", ");
			}
			System.out.println("]");
		}
		
		//리스트 내포로 만들기
//		1 2 3
//		1 2 3
//		1 2 3 
		int[][] list = new int[3][3];
		for (int i = 0; i < list.length; i++) {
			System.out.print("[");
			for (int j = 0; j < list.length; j++) {
				list[i][j] = j + 1;
				System.out.print(list[i][j]);
				if(j != list.length - 1) System.out.print(", ");
			}
			System.out.println("]");
		}
	}
}
