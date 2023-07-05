package doit;

import java.util.Scanner;

public class 연습04_05_IntQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		연습04_05_IntQueue s = new 연습04_05_IntQueue(64);	// 최대 64개 인큐할 수 있는 큐

		while (true) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 인큐　(2) 디큐　(3) 피크　" +
											 "(4) 덤프　(5) 검색 (0) 종료 : ");

			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 								//  인큐
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.enque(x);
			 	} catch (연습04_05_IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;

			 case 2: 								//  디큐
				try {
			 		x = s.deque();
					System.out.println(" 디큐한 데이터는 " + x + "입니다.");
			 	} catch (연습04_05_IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			 case 3: 								// 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (연습04_05_IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			 case 4: 								// 덤프
				s.dump();
				break;

			 case 5: { 								// 검색
				System.out.print("데이터 : ");
				x = sc.nextInt();
				int n = s.search(x);
				if (n != 0)
					System.out.printf("%d번째 데이터로 인덱스%d의 위치에 저장되어 있습니다.\n", n, s.indexOf(x));
				else
					System.out.println("그 데이터는 등록되어 있지 않습니다.");
				break;
			 }
			}
			
			sc.close();
		}
	}
	
	private int[] que;            // 큐용 배열
    private int capacity;         // 큐의 크기
    private int front;            // 맨 처음 요소 커서
    private int rear;             // 맨 끝 요소 커서
    private int num;              // 현재 데이터 개수

    //--- 실행시 예외: 큐가 비어있음 ---//
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    //--- 실행시 예외: 큐가 가득 찼음 ---//
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    //--- 생성자(constructor) ---//
    public 연습04_05_IntQueue(int maxlen) { //IntQueue
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];          // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {        // 생성할 수 없음
            capacity = 0;
        }
    }

    
    //--- 큐에 데이터를 인큐 ---//
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity)
            throw new OverflowIntQueueException();            // 큐가 가득 찼음
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear = 0;
        return x;
    }

    //--- 큐에서 데이터를 디큐 ---//
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();            // 큐가 비어있음
        int x = que[front++];
        num--;
        if (front == capacity)
            front = 0;
        return x;
    }

    //--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();            // 큐가 비어있음
        return que[front];
    }

    //--- 큐를 비움 ---//
    public void clear() {
        num = front = rear = 0;
    }

    //--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)                // 검색 성공
                return idx;
        }
        return -1;                            // 검색 실패
    }
    
	//--- 큐에서 x를 검색하여 맨앞에서 몇 번째인가(발견하지 못하면 0)를 반환합니다 ---//
    public int search(int x) {
    	for (int i = 0; i < num; i++) {
			if (que[(i + front) % capacity] == x) { //검색 성공
				return i + 1;
			}
		}
    	return 0; //검색 실패
    }
    

    //--- 큐의 크기를 반환 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
    public int size() {
        return num;
    }

    //--- 큐가 비어있는가? ---//
    public boolean isEmpty() {
        return num <= 0;
    }

    //--- 큐가 가득 찼는가? ---//
    public boolean isFull() {
        return num >= capacity;
    }

    //--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }
}
