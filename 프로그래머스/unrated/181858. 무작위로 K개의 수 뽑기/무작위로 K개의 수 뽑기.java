import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tmp.contains(arr[i]) && tmp.size() < k) {
                tmp.add(arr[i]);
            }
        }

        while (tmp.size() < k) {
            tmp.add(-1);
        }

        return tmp.stream().mapToInt(i -> i).toArray();
    }
}