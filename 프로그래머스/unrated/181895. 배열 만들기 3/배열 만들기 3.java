import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer.add(arr[j]);
            }
        }

        return answer;
    }
}