import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mode = -1;
        int tmp = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);

        for (int key : map.keySet()) {
            if (map.get(key) > mode) {
                mode = map.get(key);
                answer = key;
            } else if (mode == map.get(key)) {
                tmp = key;
            }
        }
        if (map.get(answer) == map.get(tmp)) {
            return answer = -1;
        }

        return answer;
    }
}