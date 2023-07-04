package baekjoon;

import java.util.Scanner;

public class no_2563 {

	//BufferedReader 사용
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int total = 0;  //검은 영역의 넓이
//        int n = Integer.parseInt(br.readLine());  //색종이 개수
//        boolean[][] arr = new boolean[101][101];  //도화지
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
//            for (int j = x; j < x+10; j++) {
//                for (int k = y; k < y+10; k++) {
//                    if (!arr[j][k]) {
//                        arr[j][k] = true;
//                        total++;
//                    }
//                }
//            }
//        }
//        System.out.print(total);
//		
//		br.close();
//	}
	
	//Scanner사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 색종이 개수
		int[][] A = new int[100][100];
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int a = x; a <= x + 9; a++) {
				for (int b = y; b <= y + 9; b++) {
					A[a][b] = 1;
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(A[i][j] == 1) count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
