class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};

        int length = board.length;

        boolean[][] checkBoard = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                boolean flag = true;

                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (board[i][j] == 1) {
                        checkBoard[i][j] = true;
                    }

                    if (nx >= 0 && nx < length && ny >= 0 && ny < length && board[nx][ny] == 1) {
                        checkBoard[i][j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < checkBoard.length; i++) {
            for (int j = 0; j < checkBoard.length; j++) {
                if (!checkBoard[i][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}