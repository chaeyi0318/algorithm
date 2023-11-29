import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            tmp.put(rank[i], i);
            if (attendance[i] == false) {
                tmp.remove(rank[i]);
            }
        }

        List<Integer> keySet = new ArrayList<>(tmp.keySet());
        Collections.sort(keySet);

        int num1 = tmp.getOrDefault(keySet.get(0), 0);
        int num2 = tmp.getOrDefault(keySet.get(1), 0);
        int num3 = tmp.getOrDefault(keySet.get(2), 0);

        answer = (10000 * num1) + (100 * num2) + num3;
        return answer;
    }
}