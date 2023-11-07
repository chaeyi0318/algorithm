class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            for (int k = i; k <= j; k++) {
                arr[k] += 1;
            }
        }

        return arr;
    }
}