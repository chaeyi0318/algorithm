class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}