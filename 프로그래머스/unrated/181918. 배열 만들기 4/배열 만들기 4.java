import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> tmp = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {
            if (tmp.isEmpty()) {
                tmp.add(arr[i]);
                i++;
            } else if (!tmp.isEmpty()) {
                if (tmp.get(tmp.size() - 1) < arr[i]) {
                    tmp.add(arr[i]);
                    i++;
                } else {
                    tmp.remove(tmp.size() - 1);
                }
            }
        }

        return tmp.stream().mapToInt(j->j).toArray();
    }
}