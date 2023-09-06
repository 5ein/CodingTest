package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 주사위게임3 {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;
		int answer = 0;
        
        HashMap<Integer, Integer> dice = new HashMap<>();
        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);

        ArrayList<Integer> keys = new ArrayList<>(dice.keySet());
        switch (dice.size()) {
            case 1:
                answer = 1111 * a;
                break;
            case 2:
                if (dice.containsValue(3)) {
                    int p = 0;
                    int q = 0;
                    for (Integer key : dice.keySet()) {
                        if (dice.get(key) == 3) {
                            p = key;
                        } else {
                            q = key;
                        }
                    }
                    answer = (p * 10 + q) * (p * 10 + q);
                } else {
                    answer = (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
                break;
            case 3:
                int result = 1;
                for (Integer key : dice.keySet()) {
                    if (dice.get(key) != 2) {
                        result *= key;
                    }
                }
                answer = result;
                break;
            case 4:
                Collections.sort(keys);
                answer = keys.get(0);
                break;
        }
        System.out.println(answer);
	}

}
