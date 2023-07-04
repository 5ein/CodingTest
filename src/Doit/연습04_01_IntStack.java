package doit;

import java.util.Scanner;

//int형 고정 길이 스택

public class 연습04_01_IntStack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		연습04_01_IntStack s = new 연습04_01_IntStack(64); // 최대 64 개를 푸시할 수 있는 스택

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
							 "(4) 덤프 (5) 검색 (6) 비움 " +
							 "(7) 출력 (0) 종료 : ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (연습04_01_IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (연습04_01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (연습04_01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
				
			case 5: //검색
				System.out.println("검색할 데이터: ");
				x = sc.nextInt();
				int n = s.indexOf(x);
				if(n >= 0)
					System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;
			
			case 6: //비움
				s.clear();
				break;
			
			case 7: //데이터 출력
				System.out.println("용량 : " + s.getCapacity());
				System.out.println("데이터수 : " + s.size());
				System.out.println("비어 " + (s.isEmpty()  ? "있습니다." : "있지 않습니다."));
				System.out.println("가득 " + (s.isFull() ? "차 있습니다." : "차 있지 않습니다."));
				break;
			}
		}
		sc.close();
	}
	
	private int[] stk;			// 스택용 배열 
	private int capacity;		// 스택 용량
	private int ptr;				// 스택 포인터

	//--- 실행 시 예외 : 스택이 비어 있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	//--- 실행 시 예외 : 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}

	//--- 생성자 ---//
	public 연습04_01_IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];				// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			capacity = 0;
		}
	}

	//--- 스택에 x를 푸시 ---//
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity)									// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	//--- 스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄) ---//
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	//--- 스택에서 데이터를 피크(꼭대기의 데이터를 들여다 봄) ---//
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	//--- 스택을 비웁니다 ---//
	public void clear() {
		ptr = 0;
	}

	//--- 스택에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다 ---//
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)		// 꼭대기 쪽에서 선형검색
			if (stk[i] == x)
				return i;			// 검색 성공
		return -1;				// 검색 실패
	}

	//--- 스택 용량을 반환합니다 ---//
	public int getCapacity() {
		return capacity;
	}

	//--- 스택에 쌓여있는 데이터수를 반환합니다 ---//
	public int size() {
		return ptr;
	}

	//--- 스택이 비어 있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}

	//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}

	//--- 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로  출력 ---//
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}

