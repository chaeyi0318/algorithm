import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> tmp = new ArrayList<>();

            for (int j = 0; j <= commands[i][1] - commands[i][0]; j++) {
                tmp.add(array[j + commands[i][0] - 1]);
            }

            tmp.sort(Comparator.naturalOrder());
            answer[i] = tmp.get(commands[i][2] - 1);
            tmp.clear();
        }

        return answer;
    }
}