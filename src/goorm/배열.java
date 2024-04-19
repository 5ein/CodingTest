package goorm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 배열 {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.size() + 1);
	}
}
