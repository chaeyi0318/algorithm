import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> tmp = new ArrayList<>();

        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));

            if (i > k) {
                tmp.add(i);
            }
        }
        int[] answer = new int[tmp.size()];

        answer = tmp.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}