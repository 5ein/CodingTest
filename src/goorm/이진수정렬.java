package goorm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 이진수정렬 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Pair> pairs = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int bits = Integer.bitCount(num);
			
			pairs.add(new Pair(bits, num));
		}
		sc.close();
		
		//sort(정렬할 데이터)
		Collections.sort(pairs);
		
		//데이터 중에서 가장 마지막(큰 데이터) 를 출력한다.
		System.out.println(pairs.get(k-1).num);
	}
}

class Pair implements Comparable<Pair> {
    int bits;
    int num;
    
    public Pair(int bits, int num) {
        this.bits = bits;
        this.num = num;
    }

    public int compareTo(Pair o) {
        if (this.bits == o.bits) {
            return o.num - this.num;
        } else {
            return o.bits - this.bits;
        }
    }
}
