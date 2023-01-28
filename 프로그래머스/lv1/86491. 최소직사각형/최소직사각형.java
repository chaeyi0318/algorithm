class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }
        return maxWidth * maxHeight;
    }
}