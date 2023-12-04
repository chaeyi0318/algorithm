import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> tmp = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);

            if (str.matches("[05]+")) {
                tmp.add(i);

            }
        }

        if (tmp.isEmpty()) {
            return new int[]{-1};
        }

        return tmp.stream().mapToInt(i -> i).toArray();
    }
}