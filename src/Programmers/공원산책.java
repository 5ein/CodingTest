package programmers;

import java.util.Arrays;

public class 공원산책 {

	public static void main(String[] args) {
		String[] park = { "SOO", "OOO", "OOO" };
		String[] routes = { "E 2", "S 2", "W 1" };
		System.out.println(Arrays.toString(solution(park, routes)));
	}

	public static int[] solution(String[] park, String[] routes) {
		int sx = 0;
		int sy = 0;

		char[][] arr = new char[park.length][park[0].length()];

		for (int i = 0; i < park.length; i++) {
			arr[i] = park[i].toCharArray();

			if (park[i].contains("S")) {
				sy = i;
				sx = park[i].indexOf("S");
			}//if
		}//for

		for (String st : routes) {
			String way = st.split(" ")[0];
			int len = Integer.parseInt(st.split(" ")[1]);

			int nx = sx;
			int ny = sy;

			for (int i = 0; i < len; i++) {
				if (way.equals("E")) {
					nx++;
				}//if
				if (way.equals("W")) {
					nx--;
				}//if
				if (way.equals("S")) {
					ny++;
				}//if
				if (way.equals("N")) {
					ny--;
				}//if
				if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
					if (arr[ny][nx] == 'X') {
						break;
					}//if
					if (i == len - 1) { // 범위내 & 장애물 x
						sx = nx;
						sy = ny;
					}//if
				}//if
			}//for
		}//for

		int[] answer = { sy, sx };
		return answer;
	}
	
	//다른사람풀이
//	public static int[] solution(String[] park, String[] routes) {
//        int h = park.length;
//        int w = park[0].length();
//
//        int startH = 0;
//        int startW = 0;
//
//        for(int i=0; i<h; i++){
//            if(park[i].contains("S"))
//            {
//                startH = i;
//                startW = park[i].indexOf("S"); 
//            }
//        }
//
//        for(String route : routes){
//            String d = route.split(" ")[0];
//            int move = Integer.parseInt(route.split(" ")[1]);
//
//            int moveH = startH;
//            int moveW = startW;
//
//            for(int i=0; i<move; i++)
//            {
//                switch(d) {
//                    case "S" : moveH++; break; 
//                    case "N" : moveH--; break;
//                    case "E" : moveW++; break;
//                    case "W" : moveW--; break;
//                }
//            if(moveH>=0&& moveH<h&&moveW>=0&&moveW<w){
//                if(park[moveH].substring(moveW,moveW+1).equals("X")){
//                    break;
//                }
//                if(i==move-1){
//                    startH=moveH;
//                    startW=moveW;
//                }
//                }    
//            }
//
//        }
//
//
//        int[] answer = {startH,startW};
//        return answer;
//    }
	
	//다른사람 풀이2
//	public static int[] solution(String[] park, String[] routes) {
//        int m = park.length;
//        int n = park[0].length();
//        int curX = 0;
//        int curY = 0;
//        char[][] grid = new char[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                grid[i][j] = park[i].charAt(j);
//                if (grid[i][j] == 'S') {
//                    curX = i;
//                    curY = j;
//                }
//            }
//        }
//
//        int[] dx = { -1, 1, 0, 0 };
//        int[] dy = { 0, 0, -1, 1 };
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('N', 0);
//        map.put('S', 1);
//        map.put('W', 2);
//        map.put('E', 3);
//
//        for (String command : routes) {
//
//            char op = command.charAt(0);
//            int move = command.charAt(2) - '0';
//
//            int nextX = curX;
//            int nextY = curY;
//            boolean isOK = true;
//            for (int i = 0; i < move; i++) {
//                nextX += dx[map.get(op)];
//                nextY += dy[map.get(op)];
//
//                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || grid[nextX][nextY] == 'X') {
//                    isOK = false;
//                    break;
//                }
//            }
//
//            if (isOK) {
//                curX = nextX;
//                curY = nextY;
//            }
//        }
//
//        return new int[] { curX, curY };
//    }
	
}
