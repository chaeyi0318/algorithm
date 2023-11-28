import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else if (!stk.isEmpty()) {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.pop();
                    i++;
                } else {
                    stk.push(arr[i]);
                    i++;
                }
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        return stk.stream().mapToInt(j->j).toArray();
    }
}