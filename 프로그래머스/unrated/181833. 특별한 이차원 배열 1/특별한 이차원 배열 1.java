class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }

        return answer;
    }
}