class Solution {
    public int[][] solution(int[] num_list, int n) {
        int i = num_list.length / n;
        int[][] answer = new int[i][n];
        
        int count = 0;
        
        for (int j = 0; j < answer.length; j++) {
            for (int k = 0; k < answer[j].length; k++) {
                answer[j][k] = num_list[count];
                count++;
            }
        }
        return answer;
    }
}